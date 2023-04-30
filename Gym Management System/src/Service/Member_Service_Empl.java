package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import Connections.DB;
import Model.Member;

public class Member_Service_Empl implements Member_Service {

	@Override
	public boolean AddMember(Member mbr) {
		
		String Add_member = "insert into new_member (mid,fullname,mobile_num,email_id,gender,father_name,Password,gym_time,citizen_no,age,amount) values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getDB().prepareStatement(Add_member);
			
			pstm.setInt(1,mbr.getMid());
			pstm.setString(2,mbr.getFullname());
			pstm.setString(3,mbr.getMobileNumber());
			pstm.setString(4,mbr.getEmailid());
			pstm.setString(5,mbr.getGender());
			pstm.setString(6,mbr.getFathername());
			pstm.setString(7,mbr.getPassword());
			pstm.setString(8,mbr.getGymtime());
			pstm.setString(9,mbr.getCitizenNum());
			pstm.setString(10,String.valueOf(mbr.getAge()));
			pstm.setString(11,String.valueOf(mbr.getAmountpay()));
			
			pstm.execute();
			return true;		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DeleteMembe(int mid) {
			
		String delete = "delete from new_member where mid="+mid;
		
		try {
			Statement stm = DB.getDB().createStatement();
			stm.execute(delete);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean UpdateMember(Member mbr) {
		
		String Add_member = "update new_member set fullname =?,mobile_num =?,email_id =?,gender =?,father_name =?,Password =?,gym_time =?,citizen_no =?,age =?,amount =?  where mid =? ";
		
		try {
			PreparedStatement pstm = DB.getDB().prepareStatement(Add_member);
			
			
			pstm.setString(1,mbr.getFullname());
			pstm.setString(2,mbr.getMobileNumber());
			pstm.setString(3,mbr.getEmailid());
			pstm.setString(4,mbr.getGender());
			pstm.setString(5,mbr.getFathername());
			pstm.setString(6,mbr.getPassword());
			pstm.setString(7,mbr.getGymtime());
			pstm.setString(8,mbr.getCitizenNum());
			pstm.setString(9,String.valueOf(mbr.getAge()));
			pstm.setString(10,String.valueOf(mbr.getAmountpay()));
			pstm.setInt(11,mbr.getMid());
			
			pstm.execute();
			return true;		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Member getMemeberByID(int mid) {
			
		Member mbr = new Member();
		
		String Show_all_member = "select * from new_member where mid="+mid;
		
		try {
			Statement stm = DB.getDB().createStatement();
			ResultSet  res = stm.executeQuery(Show_all_member);
			
			if(res.next()) {

				mbr.setMid(res.getInt("mid"));;
				mbr.setFullname(res.getString("fullname"));
				mbr.setMobileNumber(res.getString("mobile_num"));
				mbr.setEmailid(res.getString("email_id"));
				mbr.setGender(res.getString("gender"));
				mbr.setFathername(res.getString("father_name"));
				mbr.setPassword(res.getString("Password"));
				mbr.setGymtime(res.getString("gym_time"));
				mbr.setCitizenNum(res.getString("citizen_no"));
				mbr.setAge(res.getInt("age"));
				mbr.setAmountpay(res.getInt("amount"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mbr;
	
	}

	@Override
	public List<Member> getAllMember() {
		List<Member> m_list = new ArrayList();
		
		String Show_all_member = "select * from new_member";
		
		try {
			Statement stm = DB.getDB().createStatement();
			ResultSet  res = stm.executeQuery(Show_all_member);
			
			while(res.next()) {
				
				Member mbr = new Member();
				
				mbr.setMid(res.getInt("mid"));
				mbr.setFullname(res.getString("fullname"));
				mbr.setMobileNumber(res.getString("mobile_num"));
				mbr.setEmailid(res.getString("email_id"));
				mbr.setGender(res.getString("gender"));
				mbr.setFathername(res.getString("father_name"));
				mbr.setPassword(res.getString("Password"));
				mbr.setGymtime(res.getString("gym_time"));
				mbr.setCitizenNum(res.getString("citizen_no"));
				mbr.setAge(res.getInt("age"));
				mbr.setAmountpay(res.getInt("amount"));
				
				m_list.add(mbr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m_list;
	}

	@Override
	public List<Member> SearchMember(String s_memeber) {
		
		List<Member> m_list = new ArrayList();
		
		String Show_all_member = "select * from new_member where fullname like '%"+s_memeber+"%' OR mobile_num like '%"+s_memeber+"%' OR email_id like '%"+s_memeber+"%' OR mid like '%"+s_memeber+"%' ";
		
		try {
			Statement stm = DB.getDB().createStatement();
			ResultSet  res = stm.executeQuery(Show_all_member);
			
			while(res.next()) {
				
				Member mbr = new Member();
				
				mbr.setMid(res.getInt("mid"));
				mbr.setFullname(res.getString("fullname"));
				mbr.setMobileNumber(res.getString("mobile_num"));
				mbr.setEmailid(res.getString("email_id"));
				mbr.setGender(res.getString("gender"));
				mbr.setFathername(res.getString("father_name"));
				mbr.setPassword(res.getString("Password"));
				mbr.setGymtime(res.getString("gym_time"));
				mbr.setCitizenNum(res.getString("citizen_no"));
				mbr.setAge(res.getInt("age"));
				mbr.setAmountpay(res.getInt("amount"));
				
				m_list.add(mbr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m_list;

	}

}
