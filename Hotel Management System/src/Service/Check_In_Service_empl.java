package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import DB.Db;
import model.Customer_CheckIN;

public class Check_In_Service_empl implements Check_In_Service {

	@Override
	public boolean AddCheckIN(Customer_CheckIN cci) {
		
		String add_Check_IN = "INSERT INTO `check_in`(`fullname`, `mobile`, `nationality`, `gender`, `email`, `id_proof`, `address`, `check_date`, `bed_no`, `room_type`, `room_no`, `room_price`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pstm = Db.getDB().prepareStatement(add_Check_IN);
			
			pstm.setString(1, cci.getFullname());
			pstm.setString(2, cci.getMobile());
			pstm.setString(3, cci.getNationality());
			pstm.setString(4, cci.getGender());
			pstm.setString(5, cci.getEmail());
			pstm.setString(6, cci.getId_proof());
			pstm.setString(7, cci.getAddress());
			pstm.setDate(8, cci.getCheck_date());
			pstm.setInt(9, cci.getBed_no());
			pstm.setString(10, cci.getRoom_type());
			pstm.setString(11, cci.getRoom_no());
			pstm.setInt(12, cci.getRoom_price());	
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean DelCheckIN(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdCheckIN(Customer_CheckIN cci) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer_CheckIN getCustomerById(int id) {
		Customer_CheckIN cci = new Customer_CheckIN();
		
		String Find_Customer = "select * from check_in where room_no="+id;
		
		try {
			Statement stm = Db.getDB().createStatement();
			ResultSet res = stm.executeQuery(Find_Customer);
			
			if(res.next()) {
				cci.setFullname(res.getString("fullname"));
				cci.setMobile(res.getString("mobile"));
				cci.setNationality(res.getString("nationality"));
				cci.setGender(res.getString("gender"));
				cci.setEmail(res.getString("email"));
				cci.setId_proof(res.getString("id_proof"));
				cci.setAddress(res.getString("address"));
				cci.setCheck_date(res.getDate("check_date"));
				cci.setBed_no(res.getInt("bed_no"));
				cci.setRoom_type(res.getString("room_type"));
				cci.setRoom_no(res.getString("room_no"));
				cci.setRoom_price(res.getInt("room_price"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cci;
	}

	@Override
	public List<Customer_CheckIN> getAllCheck_In_Customer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer_CheckIN> Search_CheckIn_Customer(String s_checkIn) {
		// TODO Auto-generated method stub
		return null;
	}

}
