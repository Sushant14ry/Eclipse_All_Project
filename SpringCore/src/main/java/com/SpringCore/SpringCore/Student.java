package com.SpringCore.SpringCore;

public class Student {
	private int stid;
	private String stu_name;
	private String stu_address;
	
	public int getStid() {
//		System.out.println("Gettin Student ID");
		return stid;
	}
	public void setStid(int stid) {
//		System.out.println("Setting Student ID");
		this.stid = stid;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
//		System.out.println("Setting Student ID");
		this.stu_name = stu_name;
	}
	public String getStu_address() {
		return stu_address;
	}
	public void setStu_address(String stu_address) {
//		System.out.println("Setting Student ID");
		this.stu_address = stu_address;
	}
	
	
	public Student(int stid, String stu_name, String stu_address) {
		super();
		this.stid = stid;
		this.stu_name = stu_name;
		this.stu_address = stu_address;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stu_name=" + stu_name + ", stu_address=" + stu_address + "]";
	}
		
}
