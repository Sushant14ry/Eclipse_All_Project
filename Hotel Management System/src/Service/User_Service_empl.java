package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.Db;
import model.User;

public class User_Service_empl implements User_Service {

	@Override
	public boolean AddUser(User usr) {
		
		String Add_user = "INSERT INTO `user`(`fullname`, `email`, `mobile`, `psw`, `secqsn`, `answer`, `address`) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(Add_user);
			
			pstm.setString(1, usr.getFullname());
			pstm.setString(2, usr.getEmail());
			pstm.setString(3, usr.getMobile());
			pstm.setString(4, usr.getPsw());
			pstm.setString(5, usr.getSecqsn());
			pstm.setString(6, usr.getAnswer());
			pstm.setString(7, usr.getAddress());
			
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
	public boolean UpdUser(User usr) {
		String upd_psw = "update user set psw=? where email=? ";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(upd_psw);
			
			pstm.setString(1, usr.getPsw());
			pstm.setString(2, usr.getEmail());
			
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public User GetUserById(String umail) {
		User u = new User();
		
		String findemail = "select * from user where email='"+umail+"' ";
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(findemail);
			
			if(res.next()) {
				u.setEmail(res.getString("email"));
				u.setSecqsn(res.getString("secqsn"));
				u.setAnswer(res.getString("answer"));	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return u;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> Search_User(String s_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean LoginUser(String user, String psw) {
		String login = "Select * from user where email='"+user+"' and psw='"+psw+"' ";
		
		try {
			Statement stm = Db.getDB().createStatement();
			stm.execute(login);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
	
}
