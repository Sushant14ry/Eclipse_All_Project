package Service;

import Model.emp;

import java.util.List;

public interface emp_service {
	
	boolean addEmp(emp emply);
	boolean delEmp(int id);
	boolean updEmp(emp empl);
	
	emp getEmpById(int id);
	
	List<emp> getAllEmp();
	List<emp> SearchEmp(String search_data);
}
