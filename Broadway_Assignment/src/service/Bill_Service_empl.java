package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.db;
import model.Bill;
import model.Stock;

public class Bill_Service_empl implements Bill_Service {

	@Override
	public boolean addBill(Bill bl) {
		
		String insert_bill = "insert into bill(b_bill_no,b_customer_name,b_prod_id,product_name,b_prod_mrp,b_prod_qty,b_prod_disc,b_date)values(?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = db.getDB().prepareStatement(insert_bill);
			
			pstm.setInt(1,bl.getBill_no());
			pstm.setString(2,bl.getCustomerName());
			pstm.setInt(3,bl.getProd_id());
			pstm.setString(4,bl.getProductName());
			pstm.setInt(5,bl.getProd_mrp());
			pstm.setInt(6,bl.getProd_qty());
			pstm.setInt(7,bl.getProd_disc());
			pstm.setString(8,bl.getDate());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean removeBill(int id) {
		
		String remove_billl = "delete from bill where b_bill_no ="+id;
		System.out.println(id);
		
		try {
			Statement stm = db.getDB().createStatement();
			stm.execute(remove_billl);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Bill getBill_Id(int id) {
		
		Bill bil = new Bill();
		
		String get_bill_id = "select * from stock where p_id ="+id;
		
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet res = stm.executeQuery(get_bill_id);
			
			if(res.next()) {
				
				bil.setProd_id(res.getInt("p_id"));
				bil.setProductName(res.getString("p_name"));
				bil.setProd_mrp(res.getInt("p_mrp"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return bil;
	}

	@Override
	public List<Bill> Search_bill(String s_bill) {
		List<Bill> b_list = new ArrayList();
		String Search_bill = "select * from Bill where b_bill_no like '%"+s_bill+"%' OR b_customer_name like '%"+s_bill+"%' ";
		
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet res = stm.executeQuery(Search_bill);
			
			while(res.next()) {
				Bill b = new Bill();
				
				b.setBill_no(res.getInt("b_bill_no"));
				b.setCustomerName(res.getString("b_customer_name"));
				b.setProd_mrp(res.getInt("b_prod_mrp"));
				b.setProd_qty(res.getInt("b_prod_qty"));
				b.setDate(res.getString("b_date"));
				
				b_list.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b_list;
	}

	@Override
	public List<Bill> getAllBills() {
		List<Bill> b_list = new ArrayList<>();
		
		String show_bill = "select * from bill ";
		
		try {
			Statement stm = db.getDB().createStatement();
			ResultSet rs = stm.executeQuery(show_bill);
			
			while(rs.next()) {
				Bill bl = new Bill();
				
				bl.setBill_no(rs.getInt("b_bill_no"));
				bl.setCustomerName(rs.getString("b_customer_name"));
				bl.setProd_id(rs.getInt("b_prod_id"));
				bl.setProductName(rs.getString("product_name"));
				bl.setProd_mrp(rs.getInt("b_prod_mrp"));
				bl.setProd_qty(rs.getInt("b_prod_qty"));
				bl.setProd_disc(rs.getInt("b_prod_disc"));
				
				b_list.add(bl);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b_list;
	}

}
