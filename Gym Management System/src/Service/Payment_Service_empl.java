package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connections.DB;
import Model.Payment;

public class Payment_Service_empl implements Payment_Service {

	@Override
	public boolean PayPayment(Payment pay) {
		
		String insert_payment = "insert into payment(p_id,p_fullname,p_num,p_email,p_amount,p_date) values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getDB().prepareStatement(insert_payment);
			
			pstm.setString(1,String.valueOf( pay.getPid()));
			pstm.setString(2,pay.getFullname());
			pstm.setString(3,pay.getNumber());
			pstm.setString(4,pay.getEmail());
			pstm.setString(5,String.valueOf(pay.getAmount()));
			pstm.setString(6, pay.getPdate());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DelPayment(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdPayment(Payment py) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Payment> GetAllPayment() {
		List<Payment> p_list = new ArrayList();
		
		String AllPayment = "select * from payment";
		
		try {
			Statement stm = DB.getDB().createStatement();
			ResultSet res = stm.executeQuery(AllPayment);
			
			while(res.next()) {
				Payment py = new Payment();
				
				py.setPid(res.getInt("p_id"));
				py.setFullname(res.getString("p_fullname"));
				py.setNumber(res.getString("p_num"));
				py.setEmail(res.getString("p_email"));
				py.setAmount(res.getInt("p_amount"));
				py.setPdate(res.getString("p_date"));
				
				p_list.add(py);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return p_list;
	}

	@Override
	public List<Payment> UserPayment(int mid) {
		List<Payment> up_list = new ArrayList();
		
		String AllPayment = "select * from payment where p_id="+mid;
		
		try {
			Statement stm = DB.getDB().createStatement();
			ResultSet res = stm.executeQuery(AllPayment);
			
			while(res.next()) {
				Payment py = new Payment();
				
				py.setPid(res.getInt("p_id"));
				py.setFullname(res.getString("p_fullname"));
				py.setNumber(res.getString("p_num"));
				py.setEmail(res.getString("p_email"));
				py.setAmount(res.getInt("p_amount"));
				py.setPdate(res.getString("p_date"));
				
				up_list.add(py);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return up_list;
	}

	@Override
	public Payment GetPaymentById(int pid) {
		Payment py = new Payment();
		
		String AllPayment = "select * from payment where p_id="+pid;
		
		try {
			Statement stm = DB.getDB().createStatement();
			ResultSet res = stm.executeQuery(AllPayment);
			
			while(res.next()) {

				py.setPid(res.getInt("p_id"));
				py.setFullname(res.getString("p_fullname"));
				py.setNumber(res.getString("p_num"));
				py.setEmail(res.getString("p_email"));
				py.setAmount(res.getInt("p_amount"));
				py.setPdate(res.getString("p_date"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return py;
	}



}
