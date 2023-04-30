package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Connection.Db;
import Model.Student;

public class Student_Service_empl implements Student_Service {

	@Override
	public boolean AddStudent(Student std) {
		
		String AddStudent = "INSERT INTO `student`(`sid`, `fullname`, `fathername`, `course`, `branch`, `year`, `semester`) values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDb().prepareStatement(AddStudent);
			
			pstm.setInt(1, std.getSid());
			pstm.setString(2, std.getFullname());
			pstm.setString(3, std.getFathername());
			pstm.setString(4, std.getCourse());
			pstm.setString(5, std.getBranch());
			pstm.setString(6, std.getYear());
			pstm.setString(7, std.getSemester());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean DelStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdStudent(Student std) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentkById(int id) {
		Student std = new Student();
		
		String findStudent = "select * from issue_book where sid=13";
		
		try {
			Statement stm = Db.getDb().createStatement();
			ResultSet result = stm.executeQuery(findStudent);
			
			if(result.next()) {
				
				std.setFullname(result.getString("fullname"));
				std.setFathername(result.getString("fathername"));
				std.setCourse(result.getString("course"));
				std.setBranch(result.getString("branch"));
				std.setYear(result.getString("year"));
				std.setSemester(result.getString("semester"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return std;
	}

	@Override
	public List<Student> GetAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> SearchStudent(Student S_student) {
		// TODO Auto-generated method stub
		return null;
	}

}
