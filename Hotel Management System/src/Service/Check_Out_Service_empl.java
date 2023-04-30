package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.Db;
import model.Customer_CheckIN;
import model.Customer_CheckOut;

public class Check_Out_Service_empl implements Check_Out_Service {

	@Override
	public boolean AddCheckOut(Customer_CheckOut cco) {
		String Check_Out = "INSERT INTO `check_out`(`room_no`, `customer_name`, `checkdate`, `checkdate_today`, `mobile_num`, `gender`, `per_day`, `no_days`, `total_amount`, `email`, `room_type`)values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(Check_Out);
			
			pstm.setString(1, String.valueOf(cco.getRoom_no()));
			pstm.setString(2, cco.getCustomer_name());
			pstm.setDate(3, cco.getCheckdate());
			pstm.setString(4, cco.getCheckdate_today());
			pstm.setString(5, cco.getMobile_num());
			pstm.setString(6, cco.getGender());
			pstm.setInt(7, cco.getPer_day());
			pstm.setString(8, String.valueOf(cco.getNo_days()));
			pstm.setInt(9, cco.getTotal_amount());
			pstm.setString(10, cco.getEmail());
			pstm.setString(11, cco.getRoom_type());
			
			pstm.execute();
			return true;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false; 
	}

	@Override
	public boolean DelCheckOut(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdCheckOut(Customer_CheckOut cco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer_CheckOut getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer_CheckOut> getAllCheck_Out_Customer() {
		List<Customer_CheckOut> co_list = new ArrayList();
		
		String show_Checkout_Customer = "SELECT co.id,co.room_no,co.customer_name,co.checkdate,co.checkdate_today,co.mobile_num,co.gender,co.per_day,co.per_day,co.no_days,co.total_amount,co.email,co.room_type,ci.nationality,ci.id_proof,ci.bed_no,ci.address FROM check_out co INNER JOIN check_in ci WHERE co.mobile_num = ci.mobile;";
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(show_Checkout_Customer);
			
			while(res.next()) {
				Customer_CheckOut cco = new Customer_CheckOut();
				Customer_CheckIN cci = new Customer_CheckIN();
				
				cco.setCid(res.getInt("id"));
				cco.setRoom_no(res.getInt("room_no"));
				cco.setCustomer_name(res.getString("customer_name"));
				cco.setCheckdate(res.getDate("checkdate"));
				cco.setCheckdate_today(res.getString("checkdate_today"));
				cco.setMobile_num(res.getString("mobile_num"));
				cco.setGender(res.getString("gender"));
				cco.setPer_day(res.getInt("per_day"));
				cco.setNo_days(res.getInt("no_days"));
				cco.setTotal_amount(res.getInt("total_amount"));
				cco.setEmail(res.getString("email"));
				cco.setRoom_type(res.getString("room_type"));
				
				/// Check In Datail show
	
				cci.setNationality("nationality");
				cci.setId_proof(res.getString("id_proof"));
				cci.setAddress(res.getString("address"));
				cci.setBed_no(res.getInt("bed_no"));
				
				co_list.add(cco);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return co_list;
	}

	@Override
	public List<Customer_CheckOut> Search_CheckOut_Customer(String s_checkOut) {
		// TODO Auto-generated method stub
		return null;
	}

}
