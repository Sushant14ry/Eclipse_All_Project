package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping_Test {
	public static void main(String[] args) {
		OneToOneMapping();
		OneToMany();
		ManyToMany();
	}

	private static void ManyToMany() {
		// Create Hibernate Object
			SessionFactory sf = new Configuration().configure().buildSessionFactory();	
			Session session = sf.openSession();
			session.beginTransaction();
			
			
			Address adr = new Address();	
			adr.setCountry("Nepal");
			adr.setCity("Kathmandu");
			adr.setState("stat2");
			
			session.save(adr);
			
			
			Employee emp = new Employee();
			emp.setFname("Sushant");
			emp.setLname("Chaudhary");
			emp.setAge(21);
			emp.setSalary(2100);
			emp.setAddress(adr);
			
			Phone ph = new Phone();			
			ph.setNumber("9821224203");
			ph.setType("NCELL");
			ph.setEmployee(emp);
			session.save(ph);
			
			Phone ph2 = new Phone();			
			ph2.setNumber("9616680432");
			ph2.setType("Smart");
			ph2.setEmployee(emp);
			session.save(ph2);
			
			Department dp = new Department();
			dp.setName("Admin");
			session.save(dp);
			
			Department dp1 = new Department();
			dp1.setName("IT");
			session.save(dp1);
			
			emp.setDeptlist(Arrays.asList(dp,dp1));
			emp.setPhones(Arrays.asList(ph,ph2));	
			session.save(emp);
			session.getTransaction().commit();
			session.close();
		
	}

	private static void OneToMany() {
		// Create Hibernate Object
				SessionFactory sf = new Configuration().configure().buildSessionFactory();	
				Session session = sf.openSession();
				session.beginTransaction();
				
				
				Address adr = new Address();	
				adr.setCountry("Nepal");
				adr.setCity("Kathmandu");
				adr.setState("stat2");
				
				session.save(adr);
				
				
				Employee emp = new Employee();
				emp.setFname("Sushant");
				emp.setLname("Chaudhary");
				emp.setAge(21);
				emp.setSalary(2100);
				emp.setAddress(adr);
				
				Phone ph = new Phone();			
				ph.setNumber("9821224203");
				ph.setType("NCELL");
				ph.setEmployee(emp);
				session.save(ph);
				
				Phone ph2 = new Phone();			
				ph2.setNumber("9616680432");
				ph2.setType("Smart");
				ph2.setEmployee(emp);
				session.save(ph2);
				
				emp.setPhones(Arrays.asList(ph,ph2));
				
				session.save(emp);
				session.getTransaction().commit();
				session.close();
		
	}

	private static void OneToOneMapping() {
		// Create Hibernate Object
		SessionFactory sf = new Configuration().configure().buildSessionFactory();	
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Address adr = new Address();	
		adr.setCountry("Nepal");
		adr.setCity("Kathmandu");
		adr.setState("stat2");
		
		session.save(adr);
		
		
		Employee emp = new Employee();
		emp.setFname("Sushant");
		emp.setLname("Chaudhary");
		emp.setAge(21);
		emp.setSalary(2100);
		emp.setAddress(adr);
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
}
