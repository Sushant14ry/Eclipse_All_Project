package com.spring.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalone_collection/aloneconfig.xml");
		
		Person persn = context.getBean("person1",Person.class);
		System.out.println(persn);
		System.out.println(persn.getFriends().getClass().getName());
		System.out.println("----------------------------");
		System.out.println(persn.getFeestructure());
		System.out.println(persn.getFeestructure().getClass().getName());
		System.out.println("----------------------------");
		System.out.println(persn.getPropertiess());
	}
}
