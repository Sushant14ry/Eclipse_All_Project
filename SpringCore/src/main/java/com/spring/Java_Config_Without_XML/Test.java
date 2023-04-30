package com.spring.Java_Config_Without_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student studen  = context.getBean("temp",Student.class);
		System.out.println(studen);
		studen.Study();
	}
}
