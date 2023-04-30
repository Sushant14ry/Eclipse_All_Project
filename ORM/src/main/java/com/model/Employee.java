package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_tabl")
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String fname;
	private String lname;
	private int Salary;
	private int age;
	
	
	@OneToOne
	@JoinColumn(name="addressId") // FK Doreign Key
	private Address address;

	@OneToMany(mappedBy = "employee")
	private List<Phone> phones;
	
	@ManyToMany
	@JoinTable(name="emp_dept",joinColumns = {@JoinColumn(name="empId")}, inverseJoinColumns = {@JoinColumn(name="deptId")})
	private List<Department> deptlist;
	
	
	
	
	
	
	/// Getter Setter Start
	
	public List<Department> getDeptlist() {
		return deptlist;
	}

	public void setDeptlist(List<Department> deptlist) {
		this.deptlist = deptlist;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
