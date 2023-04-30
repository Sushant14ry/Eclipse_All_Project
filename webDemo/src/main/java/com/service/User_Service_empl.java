package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Db;
import com.model.User;

public class User_Service_empl implements User_Service{

	@Override
	public void UserSingUp(User usr) {
		
		String Singup_user = "INSERT INTO `user`(`fname`, `lname`, `number`, `address`, `email`, `password`) values('"+usr.getFname()+"','"+usr.getLname()+"','"+usr.getNumber()+"','"+usr.getAddress()+"','"+usr.getEmail()+"','"+usr.getPassword()+"')";
		
		try {
			Statement stm = Db.getConnect().createStatement();
			stm.execute(Singup_user);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean UserLogin(String user, String psw) {
		
		String login_user = "select * from user where email='"+user+"' and password='"+psw+"' ";
		
		try {
			Statement stm = Db.getConnect().createStatement();
			ResultSet res = stm.executeQuery(login_user);
			
			if(res.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<User> getAlluser() {
		List<User> u_list = new ArrayList();
		
		String show_all_data = "select * from user";
		
		try {
			Statement stm = Db.getConnect().createStatement();
			ResultSet res = stm.executeQuery(show_all_data);
			
			while(res.next()) {
				User u = new User();
				
				u.setFname(res.getString("fname"));
				u.setLname(res.getString("lname"));
				u.setNumber(res.getString("number"));
				u.setAddress(res.getString("address"));
				u.setEmail(res.getString("email"));
				u.setPassword(res.getString("password"));
				
				u_list.add(u);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u_list;
	}

}
