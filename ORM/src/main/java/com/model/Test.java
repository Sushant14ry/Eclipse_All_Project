package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test {
	public static void main(String[] args) {
//		addStudent();
//		getAll();
//		UpdateStudent();
		DeleteStudent();
	}
	
	// Add Student
	static void addStudent() {
		// Create Hibernate Object
		SessionFactory sf = new Configuration().configure().buildSessionFactory();	
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student stu = new Student();
		stu.setFname("Sushant");
		stu.setLname("Chaudhary");		
		stu.setCollege("Himchuli");
		stu.setCity("Kathmandu");
		stu.setDepartment("Gaming");
		stu.setAge(21);
		
		session.save(stu);
		session.getTransaction().commit();
		session.close();
	
	}
	
//	Get All Students
	static void getAll() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();	
		Session session = sf.openSession();
		
		Criteria crt = session.createCriteria(Student.class);
		crt.add(Restrictions.eq("college", "Himchuli")); // Show Where Sql Query
		crt.add(Restrictions.eq("city", "Kathmandu"));
		List<Student> s_list = crt.list(); // Select Sql Query
		
		s_list.forEach(System.out::println);
	}
	
	// Update Student
	static void UpdateStudent() {
		// Create Hibernate Object
			SessionFactory sf = new Configuration().configure().buildSessionFactory();	
			Session session = sf.openSession();
			session.beginTransaction();
				
			Student s = (Student) session.get(Student.class, 3);
			s.setAge(24);
			s.setCity("Kolvi");
				
			session.update(s);  // Fire Sql Query
			session.getTransaction().commit();
			session.close();
	}
	
	// Deete Student
	static void DeleteStudent() {
		// Create Hibernate Object
			SessionFactory sf = new Configuration().configure().buildSessionFactory();	
			Session session = sf.openSession();
			session.beginTransaction();
						
			Student s = (Student) session.get(Student.class, 5);
						
			session.delete(s);  // Fire Sql Query
			session.getTransaction().commit();
			session.close();
	}
}
