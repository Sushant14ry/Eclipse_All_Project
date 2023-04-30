package Opps;
/*
 * 1.	 Create a class Employee with following Properties and methods.
		a.	Salary ( Property int )
		b.	getSalary ( method returning int )
		c.	name ( Property ) ( String ) 
		d.	getName ( method returning string )
		e.	setName ( method changing name ) 
 * 
 */

class Employees{
	int salary;
	String name;
		
	public int get_salary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}
public class Basic_question {
	public static void main(String[] args) {
		Employees emp = new Employees();
		
		emp.setName("Sushant Chaudhary");
		emp.salary = 12000;
		System.out.println(emp.getName());
		System.out.println(emp.get_salary());
		
	}
}
