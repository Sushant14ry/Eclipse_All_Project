package com.spring.Constructor_Injection;

public class Person {
	private String name;
	private int pid;
	private Certi certi;
	
	public Person(String name,int pid,Certi certi) {
		this.name = name;
		this.pid = pid;
		this.certi = certi;
	}

	@Override
	public String toString() {
		
		return this.name+ " : " +this.pid+" { "+this.certi.name+" } ";
	}
	
	
	
}
