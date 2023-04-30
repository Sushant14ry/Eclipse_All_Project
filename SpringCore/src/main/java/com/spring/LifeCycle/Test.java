package com.spring.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/LifeCycle/life_cycle_config.xml");
		context.registerShutdownHook();	
	
		Example examp = (Example) context.getBean("example");
		System.out.println(examp);
	}

}
