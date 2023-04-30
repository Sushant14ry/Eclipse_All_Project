package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.db;
import model.Withdrawal;

public class Withdrawal_Service_empl implements Withdrawal_Service {

	@Override
	public boolean Add_Withdrawa_Amount(Withdrawal with) {
		
		String Add_Withdrawal = "INSERT INTO `withdrawal`(`acc_number`, `fullname`, `username`, `number`, `av_balance`, `with_balance`, `total_amount`) VALUES(?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(Add_Withdrawal);
			
			pstm.setString(1, with.getNumber());
			pstm.setString(2, with.getFullname());
			pstm.setString(3, with.getUsername());
			pstm.setString(4, with.getNumber());
			pstm.setInt(5, with.getAv_balance());
			pstm.setInt(6, with.getWith_balance());
			pstm.setInt(7, with.getTotal_amount());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Withdrawal> Show_withdrawal_Amount() {
		List<Withdrawal> w_list = new ArrayList();
		
		String show_withdrawal = "select * from withdrawal";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(show_withdrawal);
			
			while(res.next()) {
				Withdrawal w = new Withdrawal();
				
				w.setWid(res.getInt("wid"));
				w.setAcc_number(res.getString("acc_number"));
				w.setFullname(res.getString("fullname"));
				w.setUsername(res.getString("username"));
				w.setNumber(res.getString("number"));
				w.setAv_balance(res.getInt("av_balance"));
				w.setWith_balance(res.getInt("with_balance"));
				w.setTotal_amount(res.getInt("total_amount"));
				
				w_list.add(w);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return w_list;
	}

	@Override
	public List<Withdrawal> Search_withdrawal_Amount(String S_with) {
		List<Withdrawal> w_list = new ArrayList();
		
		String show_withdrawal = "select * from withdrawal where acc_number like '"+S_with+"' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(show_withdrawal);
			
			while(res.next()) {
				Withdrawal w = new Withdrawal();
				
				w.setWid(res.getInt("wid"));
				w.setAcc_number(res.getString("acc_number"));
				w.setFullname(res.getString("fullname"));
				w.setUsername(res.getString("username"));
				w.setNumber(res.getString("number"));
				w.setAv_balance(res.getInt("av_balance"));
				w.setWith_balance(res.getInt("with_balance"));
				w.setTotal_amount(res.getInt("total_amount"));
				
				w_list.add(w);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return w_list;
	}

}
