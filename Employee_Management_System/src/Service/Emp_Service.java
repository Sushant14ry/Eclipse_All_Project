package Service;

import java.util.List;

import Model.Employee;

public interface Emp_Service {
	
	boolean AddEmp(Employee emp);
	
	boolean DelEmp(int id);
	
	boolean UpdEmp(Employee emp);
	
	Employee getEmpById(int id);
	
	List<Employee> AllEmployee();
	
	List<Employee> SearchEmp(String s_data);
	
}
