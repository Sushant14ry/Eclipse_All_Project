package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.conect;
import Model.emp;

public class emp_service_empl implements emp_service {

	@Override
	public boolean addEmp(emp emply) {
		String ins = "insert into employee(fname,lname,gender,phone,email,company,post,department,salary,age,country,city,state,zip,Service,Qualification,dob,joinDate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = conect.getdbconect().prepareStatement(ins);
			
			pstm.setString(1,emply.getFname());
			pstm.setString(2,emply.getLname());
			pstm.setString(3,emply.getGender());
			pstm.setString(4,emply.getPhone());
			pstm.setString(5,emply.getEmail());
			pstm.setString(6,emply.getCompany());
			pstm.setString(7,emply.getPost());
			pstm.setString(8,emply.getDepartment());
			pstm.setInt(9,emply.getSalary());
			pstm.setInt(10,emply.getAge());
			pstm.setString(11,emply.getCountry());
			pstm.setString(12,emply.getCity());
			pstm.setString(13,emply.getState());
			pstm.setString(14,emply.getZip());
			pstm.setString(15,emply.getService());
			pstm.setString(16,emply.getQualification());
			pstm.setDate(17,emply.getDob());
			pstm.setDate(18,emply.getJoinDate());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean delEmp(int id) {
			
		String delete = "delete from employee where id="+id;
		
		try {
			Statement stm = conect.getdbconect().createStatement();
			stm.execute(delete);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updEmp(emp empl) {
		String update = "update employee set fname =?,lname =?,gender =?,phone =?,email =?,company =?,post =?,department =?,salary =?,age =?,country =?,city =?,state =?,zip =?,Service =?,Qualification =?,dob =?,joinDate =? where id =?";
		
		try {
			PreparedStatement pstm = conect.getdbconect().prepareStatement(update);
			
			pstm.setString(1,empl.getFname());
			pstm.setString(2,empl.getLname());
			pstm.setString(3,empl.getGender());
			pstm.setString(4,empl.getPhone());
			pstm.setString(5,empl.getEmail());
			pstm.setString(6,empl.getCompany());
			pstm.setString(7,empl.getPost());
			pstm.setString(8,empl.getDepartment());
			pstm.setInt(9,empl.getSalary());
			pstm.setInt(10,empl.getAge());
			pstm.setString(11,empl.getCountry());
			pstm.setString(12,empl.getCity());
			pstm.setString(13,empl.getState());
			pstm.setString(14,empl.getZip());
			pstm.setString(15,empl.getService());
			pstm.setString(16,empl.getQualification());
			pstm.setDate(17,empl.getDob());
			pstm.setDate(18,empl.getJoinDate());
			pstm.setInt(19,empl.getId());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public emp getEmpById(int id) {
			
		emp em = new emp();
		
		String get_id = "select * from employee where id="+id;
		
		try {
			Statement stm = conect.getdbconect().createStatement();
			ResultSet result = stm.executeQuery(get_id);
			
			if(result.next()) {
				em.setId(result.getInt("ID"));
				em.setFname(result.getString("Fname"));
				em.setLname(result.getString("lname"));
				em.setCity(result.getString("City"));
				em.setEmail(result.getString("Email"));
				em.setPhone(result.getString("Phone"));
				em.setGender(result.getString("Gender"));
				em.setDob(result.getDate("DOB"));
				em.setService(result.getString("Service"));
				em.setPost(result.getString("Post"));
				em.setSalary(result.getInt("Salary"));
				em.setJoinDate(result.getDate("JoinDate"));
				em.setZip(result.getString("Zip"));
				em.setCompany(result.getString("Company"));
				em.setAge(result.getInt("Age"));
			
				// Combo Box Code
				em.setCountry(result.getString("Country"));
				em.setState(result.getString("State"));
				em.setQualification(result.getString("Qualification"));
				em.setDepartment(result.getString("Department"));
				em.setPost(result.getString("Post"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return em;
	}

	@Override
	public List<emp> getAllEmp() {
		List<emp> emp_list = new ArrayList<>();
		
		String show_Data = "select * from employee";
		
		try {
			Statement stm = conect.getdbconect().createStatement();
			ResultSet result = stm.executeQuery(show_Data);
			
			while(result.next()) {
				emp emply = new emp();
				emply.setId(result.getInt("ID"));
				emply.setFname(result.getString("Fname"));
				emply.setLname(result.getString("Lname"));
				emply.setCity(result.getString("City"));
				emply.setEmail(result.getString("Email"));
				emply.setPhone(result.getString("Phone"));
				emply.setGender(result.getString("Gender"));
				emply.setDob(result.getDate("DOB"));
				emply.setCompany(result.getString("Company"));
				emply.setService(result.getString("Service"));
				emply.setDepartment(result.getString("Department"));
				emply.setPost(result.getString("Post"));
				emply.setSalary(result.getInt("Salary"));
				emply.setJoinDate(result.getDate("JoinDate"));
				emply.setZip(result.getString("Zip"));
				
				emp_list.add(emply);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp_list;
	}

	@Override
	public List<emp> SearchEmp(String search_data) {
		
		List<emp> emp_list = new ArrayList<>();
		
		String show = "Select * from employee where fname like '%"+ search_data +"%' OR city like '%"+ search_data+"%' OR email like '%"+search_data+"%' OR phone like '%"+search_data+"%' ";
		
		try {
			Statement stm = conect.getdbconect().createStatement();
			ResultSet result = stm.executeQuery(show);
			
			while(result.next()) {
				emp emply = new emp();
				emply.setId(result.getInt("ID"));
				emply.setFname(result.getString("Fname"));
				emply.setLname(result.getString("Lname"));
				emply.setCity(result.getString("City"));
				emply.setEmail(result.getString("Email"));
				emply.setPhone(result.getString("Phone"));
				emply.setGender(result.getString("Gender"));
				emply.setDob(result.getDate("DOB"));
				emply.setCompany(result.getString("Company"));
				emply.setService(result.getString("Service"));
				emply.setDepartment(result.getString("Department"));
				emply.setPost(result.getString("Post"));
				emply.setSalary(result.getInt("Salary"));
				emply.setJoinDate(result.getDate("JoinDate"));
				
				emp_list.add(emply);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp_list;
		
	}

}
