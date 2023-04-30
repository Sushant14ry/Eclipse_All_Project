package com.spring.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/Stereotype/stereo_config.xml");
		/* First Method without Object in Stereo Annotation */
		/* Student student = con.getBean("student",Student.class); */
		
		/* Seond Method with Object in Stereo Annotation */
		Student student = con.getBean("ob",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		System.out.println("-------- Java HashCode Prototype --------");
		System.out.println(student.hashCode());
		Student student2 = con.getBean("ob",Student.class);
		System.out.println(student2.hashCode());
		System.out.println("-------- Java HashCode 2 Singleton --------");
		
		Teacher t1 = con.getBean("teacher",Teacher.class);
		Teacher t2 = con.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
