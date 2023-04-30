package com.spring.Java_Config_Without_XML;

import org.springframework.stereotype.Component;

/*@Component("first_student")*/
public class Student {
	// Inject Dependencies ( Constructor Injection )
	private Samosa samosha;
	
	public Samosa getSamosha() {
		return samosha;
	}

	public void setSamosha(Samosa samosha) {
		this.samosha = samosha;
	}

	public Student(Samosa samosha) {
		super();
		this.samosha = samosha;
	}

	public void Study() {
		this.samosha.display();
		System.out.println("Student is Reading Book");
	}
}
