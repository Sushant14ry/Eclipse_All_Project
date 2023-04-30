package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.db;
import model.Cashier;

public class Cashier_Service_empl implements Cashier_Service {

	@Override
	public boolean AddCashier(Cashier cash) {
		
		String addCashier = "insert into cashier(cid,cash_name,cash_num,cash_address,cash_email,cash_psw)values(?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pstm = db.getDB().prepareStatement(addCashier);
			
			pstm.setInt(1,cash.getCashierid());
			pstm.setString(2,cash.getCashiername());
			pstm.setString(3,cash.getCashiernum());
			pstm.setString(4,cash.getCashieraddress());
			pstm.setString(5,cash.getCashieremail());
			pstm.setString(6,cash.getCashierpsw());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DelCashier(int id) {
		
		String del_Cashier = "delete from cashier where cid = "+id;
		
		try {
			Statement stm = db.getDB().createStatement();
			stm.execute(del_Cashier);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return false;
	}

	@Override
	public boolean UpdCashier(Cashier sup) {
			
			String update_cash = "update cashier set cash_name =?,cash_num =?,cash_address =?,cash_email =?,cash_psw =?  where cid =? ";
		
			try {
				PreparedStatement pstm = db.getDB().prepareStatement(update_cash);
				
				pstm.setString(1,sup.getCashiername());
				pstm.setString(2,sup.getCashiernum());
				pstm.setString(3,sup.getCashieraddress());
				pstm.setString(4,sup.getCashieremail());
				pstm.setString(5,sup.getCashierpsw());
				pstm.setInt(6,sup.getCashierid());
				
				pstm.execute();
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return false;
	}

	@Override
	public Cashier getCashierUserId(int id) {
		
		Cashier cr = new Cashier();
		
		String get_id = "select * from cashier where cid = "+id;
		
		try {
			Statement stm = db.getDB().createStatement();
			
			ResultSet rs = stm.executeQuery(get_id);
			
			if(rs.next()) {
				
				cr.setCashierid(rs.getInt("cid"));
				cr.setCashiername(rs.getString("cash_name"));
				cr.setCashiernum(rs.getString("cash_num"));
				cr.setCashieraddress(rs.getString("cash_address"));
				cr.setCashieremail(rs.getString("cash_email"));
				cr.setCashierpsw(rs.getString("cash_psw"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cr;
	}

	@Override
	public List<Cashier> getAllCashierUser() {
		List<Cashier> e_list = new ArrayList();
		
		String show_Cashier_Data = "select * from cashier";
		
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet res = stm.executeQuery(show_Cashier_Data);
			
			while(res.next()) {
				Cashier c = new Cashier();
				
				c.setCashierid(res.getInt("cid"));
				c.setCashiername(res.getString("cash_name"));
				c.setCashiernum(res.getString("cash_num"));
				c.setCashieraddress(res.getString("cash_address"));
				c.setCashieremail(res.getString("cash_email"));
				c.setCashierpsw(res.getString("cash_psw"));
				
				e_list.add(c);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return e_list;
	}

	@Override
	public List<Cashier> SearchCashierUser(String S_user_cash) {
		List<Cashier> c_list = new ArrayList();
		
		String Search_Cashier = "select * from cashier where cash_name like '%"+S_user_cash+"%' OR cash_num like '%"+S_user_cash+"%' OR cash_email like '%"+S_user_cash+"%' ";
		
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet res = stm.executeQuery(Search_Cashier);
			
			while(res.next()) {
				Cashier c = new Cashier();
				
				c.setCashierid(res.getInt("cid"));
				c.setCashiername(res.getString("cash_name"));
				c.setCashiernum(res.getString("cash_num"));
				c.setCashieraddress(res.getString("cash_address"));
				c.setCashieremail(res.getString("cash_email"));
				c.setCashierpsw(res.getString("cash_psw"));
				
				c_list.add(c);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c_list;
	}

}
