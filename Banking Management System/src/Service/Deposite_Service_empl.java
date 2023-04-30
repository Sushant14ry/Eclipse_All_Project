package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.db;
import model.Deposite;

public class Deposite_Service_empl implements Deposite_Service {

	@Override
	public boolean Add_Deposite_Amount(Deposite dep) {
		
		String Add_Deposite = "INSERT INTO `deposite`(`acc_no`, `fullname`, `username`, `number`, `av_balance`, `dep_name`, `dep_num`, `dep_amount`, `total_amount`) VALUES(?,?,?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(Add_Deposite);
			
			pstm.setString(1, dep.getAcc_no());
			pstm.setString(2, dep.getFullname());
			pstm.setString(3, dep.getUsername());
			pstm.setString(4, dep.getNumber());
			pstm.setInt(5, dep.getAv_balance());
			pstm.setString(6, dep.getDep_name());
			pstm.setString(7, dep.getDep_num());
			pstm.setInt(8, dep.getDep_amount());
			pstm.setInt(9, dep.getTotal_amount());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Deposite> Show_All_Deposite() {
		List<Deposite> d_list = new ArrayList();
		
		String show_deposite = "select * from deposite";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(show_deposite);
			
			while(res.next()) {
				Deposite d = new Deposite();
				
				d.setDid(res.getInt("did"));
				d.setAcc_no(res.getString("acc_no"));
				d.setFullname(res.getString("fullname"));
				d.setUsername(res.getString("username"));
				d.setNumber(res.getString("number"));
				d.setDep_name(res.getString("dep_name"));
				d.setDep_num(res.getString("dep_num"));
				d.setAv_balance(res.getInt("av_balance"));
				d.setDep_amount(res.getInt("dep_amount"));
				d.setTotal_amount(res.getInt("total_amount"));
				
				d_list.add(d);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d_list;
	}

	@Override
	public List<Deposite> Search_All_Deposite(String S_dep) {
	List<Deposite> d_list = new ArrayList();
		
		String show_deposite = "select * from deposite where acc_no like '%"+S_dep+"%' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(show_deposite);
			
			while(res.next()) {
				Deposite d = new Deposite();
				
				d.setDid(res.getInt("did"));
				d.setAcc_no(res.getString("acc_no"));
				d.setFullname(res.getString("fullname"));
				d.setUsername(res.getString("username"));
				d.setNumber(res.getString("number"));
				d.setDep_name(res.getString("dep_name"));
				d.setDep_num(res.getString("dep_num"));
				d.setAv_balance(res.getInt("av_balance"));
				d.setDep_amount(res.getInt("dep_amount"));
				d.setTotal_amount(res.getInt("total_amount"));
				
				d_list.add(d);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d_list;
	}

}
