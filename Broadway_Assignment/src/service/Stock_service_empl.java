package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.db;
import model.Stock;

public class Stock_service_empl implements Stock_service {

	@Override
	public boolean AddStock(Stock stk) {
		String AddStock = "insert into stock(p_id,p_name,p_qty,p_nqty,p_mrp)values(?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = db.getDB().prepareStatement(AddStock);
			
			pstm.setString(1,String.valueOf(stk.getPid()));
			pstm.setString(2,stk.getPname());
			pstm.setString(3,String.valueOf(stk.getPqty()));
			pstm.setString(4,String.valueOf(stk.getPnqty()));
			pstm.setString(5,String.valueOf(stk.getPmrp()));
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DelStock(int id) {
		
		String del_stock = "delete from stock where p_id="+id;
		
		try {
			Statement stm = db.getDB().createStatement();
			stm.execute(del_stock);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean UpdStock(Stock stk) {
		
		String Upd_stock = "update stock set p_name =?, p_qty =?, p_nqty =?, p_mrp =? where p_id =? ";
		
		try {
			PreparedStatement pstm = db.getDB().prepareStatement(Upd_stock);
			
			pstm.setString(1,stk.getPname());
			pstm.setString(2,String.valueOf(stk.getPqty()));
			pstm.setString(3, String.valueOf(stk.getPnqty()));
			pstm.setString(4,String.valueOf(stk.getPmrp()));
			pstm.setString(5, String.valueOf(stk.getPid()));
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Stock getStockId(int id) {
		
		Stock stk = new Stock();
		
		String get_id = "select * from stock where p_id="+id;
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet rs = stm.executeQuery(get_id);
			
			if(rs.next()) {
				
				stk.setPid(rs.getInt("p_id"));
				stk.setPname(rs.getString("p_name"));
				stk.setPqty(rs.getInt("p_qty"));
				stk.setPmrp(rs.getInt("p_mrp"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stk;
	}

	@Override
	public List<Stock> getStocks() {
		List<Stock> s_list = new ArrayList();
		
		String allStock = "select * from stock";
		
		try {
			Statement stm = db.getDB().createStatement();
			
			ResultSet res = stm.executeQuery(allStock);
			
			while(res.next()) {
				Stock s = new Stock();
				
				s.setPid(res.getInt("p_id"));
				s.setPname(res.getString("p_name"));
				s.setPnqty(res.getInt("P_nqty"));
				s.setPqty(res.getInt("p_QTY"));
				s.setPmrp(res.getInt("p_MRP"));
				
				s_list.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s_list;
	}

	@Override
	public List<Stock> SearchStock(String s_stk) {
		List<Stock> s_list = new ArrayList();
		
		String Search_bill = "select * from stock where  p_id like '%"+s_stk+"%' OR p_name like '%"+s_stk+"%' ";
		
		try {
			Statement stm = db.getDB().createStatement();

			ResultSet res = stm.executeQuery(Search_bill);
			
			while(res.next()) {
				Stock s = new Stock();
				
				s.setPid(res.getInt("p_id"));
				s.setPname(res.getString("p_name"));
				s.setPqty(res.getInt("p_QTY"));
				s.setPmrp(res.getInt("p_MRP"));
				
				s_list.add(s);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s_list;
	}

}
