package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.db;
import model.SingUp;

public class Market_User_Service_empl implements Market_User_Service {

	@Override
	public boolean AddUser(SingUp sup) {
		
		
		
		String addUser ="insert into singup(fname,lname,username,psw,re_psw,dob,address)values(?,?,?,?,?,?,?)";
		
//		PreparedStatement pstm =
		try {
			PreparedStatement pstm = db.getDB().prepareStatement(addUser);
			
			pstm.setString(1,sup.getFname());
			pstm.setString(2,sup.getLname());
			pstm.setString(3,sup.getUsername());
			pstm.setString(4,sup.getPsw());
			pstm.setString(5,sup.getRe_psw());
			pstm.setDate(6,sup.getDob());
			pstm.setString(7,sup.getAddress());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DelUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdUser(SingUp sup) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SingUp getUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SingUp> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SingUp> SearchUser(String S_user) {
		// TODO Auto-generated method stub
		return null;
	}

}
