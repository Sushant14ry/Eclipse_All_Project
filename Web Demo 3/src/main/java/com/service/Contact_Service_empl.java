package com.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.db;
import com.model.Contact;

public class Contact_Service_empl implements Contact_Service {

	@Override
	public void AddContact(Contact cn) {
		
		/*
		 * // String sql =
		 * "INSERT INTO `contact`(`name`, `email`, `subject`, `message`) VALUES (?,?,?,?)"
		 * ;
		 * 
		 * try { PreparedStatement pstm = db.getDb().prepareStatement(sql);
		 * pstm.setString(1, cn.getFname()); pstm.setString(1, cn.getEmail());
		 * pstm.setString(1, cn.getSubject()); pstm.setString(1, cn.getMessage());
		 * 
		 * pstm.execute(); return ;
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		String sql ="INSERT INTO `contact`(`name`, `email`, `subject`, `message`) VALUES('"+cn.getFname()+"','"+cn.getEmail()+"','"+cn.getSubject()+"','"+cn.getMessage()+"')";
		
		try {
			Statement stm = db.getDb().createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
