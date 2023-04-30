package com.spring.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ambiguity/amb_config.xml");
		Addition add = (Addition) context.getBean("add");
		add.doSum();	
	}
}
