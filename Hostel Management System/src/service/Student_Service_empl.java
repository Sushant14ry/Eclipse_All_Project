package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.db;
import model.Student;

public class Student_Service_empl implements Student_Service {

	@Override
	public boolean AddStudent(Student st) {
		String add = "INSERT INTO `student`(`mobile`, `fullname`, `fathername`, `mothername`, `emailid`, `paddress`, `taddress`, `ctznno`, `colzname`,roomno) VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = db.getdb().prepareStatement(add);
			
			pstm.setString(1, st.getMobile());
			pstm.setString(2, st.getFullname());
			pstm.setString(3, st.getFathername());
			pstm.setString(4, st.getMothername());
			pstm.setString(5, st.getEmailid());
			pstm.setString(6, st.getPaddress());
			pstm.setString(7, st.getTaddress());
			pstm.setString(8, st.getCtzno());
			pstm.setString(9, st.getColzname());
			pstm.setString(10, st.getRoomno());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean DelStudent(String sid) {
		String del = "delete from student where mobile="+sid;
		
		try {
			Statement stm = db.getdb().createStatement();
			stm.execute(del);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean UpdStudent(Student st) {
		String update = "UPDATE `student` SET fullname =?,fathername =?,mothername =?,emailid =?,paddress =?,taddress =?,ctznno =?,colzname =?,roomno =? WHERE mobile =?";
		
		try {
			PreparedStatement pstm = db.getdb().prepareStatement(update);
			
			pstm.setString(1, st.getFullname());
			pstm.setString(2, st.getFathername());
			pstm.setString(3, st.getMothername());
			pstm.setString(4, st.getEmailid());
			pstm.setString(5, st.getPaddress());
			pstm.setString(6, st.getTaddress());
			pstm.setString(7, st.getCtzno());
			pstm.setString(8, st.getColzname());
			pstm.setString(9, st.getRoomno());
			pstm.setString(10, st.getMobile());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Student getStudentById(String sid) {
		
		Student st = new Student();
		String findbyID = "select * from student where mobile="+sid;
		
		try {
			Statement stm = db.getdb().createStatement();
			ResultSet res = stm.executeQuery(findbyID);
			
			if(res.next()) {
				st.setMobile(res.getString("mobile"));
				st.setFullname(res.getString("fullname"));
				st.setFathername(res.getString("fathername"));
				st.setMothername(res.getString("mothername"));
				st.setEmailid(res.getString("emailid"));
				st.setPaddress(res.getString("paddress"));
				st.setTaddress(res.getString("taddress"));
				st.setCtzno(res.getString("ctznno"));
				st.setColzname(res.getString("colzname"));
				st.setRoomno(res.getString("roomno"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> s_list = new ArrayList();
		
		String show = "select * from student";
		
		try {
			Statement stm = db.getdb().createStatement();
			ResultSet res = stm.executeQuery(show);
			
			while(res.next()) {
				Student st = new Student();
				
				st.setMobile(res.getString("mobile"));
				st.setFullname(res.getString("fullname"));
				st.setFathername(res.getString("fathername"));
				st.setMothername(res.getString("mothername"));
				st.setEmailid(res.getString("emailid"));
				st.setPaddress(res.getString("paddress"));
				st.setTaddress(res.getString("taddress"));
				st.setCtzno(res.getString("ctznno"));
				st.setColzname(res.getString("colzname"));
				st.setRoomno(res.getString("roomno"));
				
				s_list.add(st);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s_list;
	}

	@Override
	public List<Student> SearchStudent(String s_student) {
		// TODO Auto-generated method stub
		return null;
	}

}
