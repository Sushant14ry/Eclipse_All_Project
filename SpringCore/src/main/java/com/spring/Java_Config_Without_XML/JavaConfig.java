package com.spring.Java_Config_Without_XML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ComponentScan(basePackages = "com.spring.Java_Config_Without_XML") */
public class JavaConfig {
	@Bean
	public Samosa getSamosha() {
		return new Samosa();
	}
	
	@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		// Creating a New Student Object
		Student student = new Student(getSamosha());
		return student;
	}
}
