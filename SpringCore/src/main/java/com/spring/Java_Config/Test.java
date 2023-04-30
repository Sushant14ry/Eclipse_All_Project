package com.spring.Java_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Java_Config/javacon_config.xml");
		Student studen  = context.getBean("first_student",Student.class);
		System.out.println(studen);
		
	}
}
