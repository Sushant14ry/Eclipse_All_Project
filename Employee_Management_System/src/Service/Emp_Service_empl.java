package Service;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.Db;
import Model.Employee;

public class Emp_Service_empl implements Emp_Service {

	@Override
	public boolean AddEmp(Employee emp) {
		
		String addemp = "INSERT INTO employee(empid,empname,empnumber,empage,empgender,empdepartment,empshift,empsalary,empdob,image) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(addemp);
			
			pstm.setInt(1,emp.getEmpid());
			pstm.setString(2,emp.getName());
			pstm.setString(3,emp.getNumber());
			pstm.setInt(4,emp.getAge());
			pstm.setString(5,emp.getGender());
			pstm.setString(6,emp.getDepartment());
			pstm.setString(7,emp.getShift());
			pstm.setInt(8,emp.getSalary());
			pstm.setDate(9,emp.getDob());
			pstm.setString(10,emp.getImage());
	
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean DelEmp(int id) {
		String del_emp = "delete from employee where empid="+id;
		try {
			Statement stm = Db.getDB().createStatement();
			stm.execute(del_emp);
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean UpdEmp(Employee emp) {
		
		String updemp = "Update employee set empname=?, empnumber=?, empage=?, empgender=?, empdepartment=?, empshift=?, empsalary=?, empdob=?, image=?  where empid=? ";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(updemp);
			
			pstm.setString(1,emp.getName());
			pstm.setString(2,emp.getNumber());
			pstm.setInt(3,emp.getAge());
			pstm.setString(4,emp.getGender());
			pstm.setString(5,emp.getDepartment());
			pstm.setString(6,emp.getShift());
			pstm.setInt(7,emp.getSalary());
			pstm.setDate(8,emp.getDob());
			pstm.setString(9,emp.getImage());
			pstm.setInt(10,emp.getEmpid());
	
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Employee getEmpById(int id) {
		Employee emp = new Employee();
		
		String show_data_get_id = "select * from employee where empid="+id;
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(show_data_get_id);
			
			if(res.next()) {
				
				emp.setEmpid(res.getInt("empid"));
				emp.setName(res.getString("empname"));
				emp.setNumber(res.getString("empnumber"));
				emp.setAge(res.getInt("empage"));
				emp.setGender(res.getString("empgender"));
				emp.setDepartment(res.getString("empdepartment"));
				emp.setShift(res.getString("empshift"));
				emp.setSalary(res.getInt("empsalary"));
				emp.setDob(res.getDate("empdob"));
				emp.setImage(res.getString("image"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<Employee> AllEmployee() {
		List<Employee> e_list = new ArrayList();
		
		String show_data = "select * from employee";
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(show_data);
			
			while(res.next()) {
				Employee emp = new Employee();
				
				emp.setEmpid(res.getInt("empid"));
				emp.setName(res.getString("empname"));
				emp.setNumber(res.getString("empnumber"));
				emp.setAge(res.getInt("empage"));
				emp.setGender(res.getString("empgender"));
				emp.setDepartment(res.getString("empdepartment"));
				emp.setShift(res.getString("empshift"));
				emp.setSalary(res.getInt("empsalary"));
				emp.setDob(res.getDate("empdob"));
				emp.setImage(res.getString("image"));
				
				e_list.add(emp);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return e_list;
	}

	@Override
	public List<Employee> SearchEmp(String s_data) {
		List<Employee> e_list = new ArrayList<>();
		
		String Search_emp = "select * from employee where empid like '"+s_data+"' or empname like '%"+s_data+"%' or empnumber like '%"+s_data+"%' ";
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(Search_emp);
			
			while(res.next()) {
				Employee emp = new Employee();
				
				emp.setEmpid(res.getInt("empid"));
				emp.setName(res.getString("empname"));
				emp.setNumber(res.getString("empnumber"));
				emp.setAge(res.getInt("empage"));
				emp.setGender(res.getString("empgender"));
				emp.setDepartment(res.getString("empdepartment"));
				emp.setShift(res.getString("empshift"));
				emp.setSalary(res.getInt("empsalary"));
				emp.setDob(res.getDate("empdob"));
				emp.setImage(res.getString("image"));
				
				e_list.add(emp);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return e_list;
	}

}
