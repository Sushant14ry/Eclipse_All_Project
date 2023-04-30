package Opps;

class Employee{
	int id;
	int salary;
	String name;
	
	public void printDetails() {
		System.out.println("My id is "+id);
		System.out.println("My Name is "+name);
	}
	public int getSalary() {
		return salary;
	}
}

public class custom_class {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		emp.id =12;
		emp.name = "Sushant";
		emp.salary = 12000;
		
		emp1.id = 16;
		emp1.name = "Prashant";
		emp1.salary = 15000;
		
		emp.printDetails();
		System.out.println("------------------");
		emp1.printDetails();
		int salary = emp1.getSalary();
		System.out.println("My Salary is "+salary);
	}
}
