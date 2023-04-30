package com.spring.static_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/static_method/spel_config.xml");
		Demo dem = context.getBean("demo",Demo.class);
		System.out.println(dem);
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expre = temp.parseExpression("8+32"); 
		System.out.println(expre.getValue());
	}
}
