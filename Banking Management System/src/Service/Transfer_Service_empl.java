package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.db;
import model.Transfer;

public class Transfer_Service_empl implements Transfer_Service {

	@Override
	public boolean Add_Transfer_Balance(Transfer trf) {
		
		String Add_Transfer = "INSERT INTO `transfer`(`tacc_no`, `tfullname`, `tav_balance`, `ttransfer_amount`, `ttotal_amount`, `cacc_no`, `cfullname`, `cnumber`, `ctransfer_balance`) VALUES(?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(Add_Transfer);
			
			pstm.setString(1, trf.getTacc_no());
			pstm.setString(2, trf.getTfullname());
			pstm.setInt(3, trf.getTav_balance());
			pstm.setInt(4, trf.getTtransfer_amount());
			pstm.setInt(5, trf.getTtotal_amount());
			pstm.setString(6, trf.getCacc_no());
			pstm.setString(7, trf.getCfullname());
			pstm.setString(8, trf.getCnumber());
			pstm.setInt(9, trf.getCtransfer_balance());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Transfer> getAllTransferData() {
		List<Transfer> t_list = new ArrayList();
		
		String Show_Transfer = "select * from transfer";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(Show_Transfer);
			
			while(res.next()) {
				Transfer t = new Transfer();
				
				t.setTid(res.getInt("tid"));
				t.setTacc_no(res.getString("tacc_no"));
				t.setTfullname(res.getString("tfullname"));
				t.setTav_balance(res.getInt("tav_balance"));
				t.setTtransfer_amount(res.getInt("ttransfer_amount"));
				t.setTtotal_amount(res.getInt("ttotal_amount"));
				t.setCacc_no(res.getString("cacc_no"));
				t.setCfullname(res.getString("cfullname"));
				t.setCnumber(res.getString("cnumber"));
				t.setCtransfer_balance(res.getInt("ctransfer_balance"));
				
				t_list.add(t);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t_list;
	}

	@Override
	public List<Transfer> To_SearchTransferData(String S_t_trans) {
		List<Transfer> t_list = new ArrayList();
		
		String Show_Transfer = "select * from transfer where cacc_no like '%"+S_t_trans+"%' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(Show_Transfer);
			
			while(res.next()) {
				Transfer t = new Transfer();
				
				t.setTid(res.getInt("tid"));
				t.setTacc_no(res.getString("tacc_no"));
				t.setTfullname(res.getString("tfullname"));
				t.setTav_balance(res.getInt("tav_balance"));
				t.setTtransfer_amount(res.getInt("ttransfer_amount"));
				t.setTtotal_amount(res.getInt("ttotal_amount"));
				t.setCacc_no(res.getString("cacc_no"));
				t.setCfullname(res.getString("cfullname"));
				t.setCnumber(res.getString("cnumber"));
				t.setCtransfer_balance(res.getInt("ctransfer_balance"));
				
				t_list.add(t);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t_list;
	}

	@Override
	public List<Transfer> From_SearchTransferData(String S_f_trans) {
	List<Transfer> t_list = new ArrayList();
		
		String Show_Transfer = "select * from transfer where tacc_no like '%"+S_f_trans+"%' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(Show_Transfer);
			
			while(res.next()) {
				Transfer t = new Transfer();
				
				t.setTid(res.getInt("tid"));
				t.setTacc_no(res.getString("tacc_no"));
				t.setTfullname(res.getString("tfullname"));
				t.setTav_balance(res.getInt("tav_balance"));
				t.setTtransfer_amount(res.getInt("ttransfer_amount"));
				t.setTtotal_amount(res.getInt("ttotal_amount"));
				t.setCacc_no(res.getString("cacc_no"));
				t.setCfullname(res.getString("cfullname"));
				t.setCnumber(res.getString("cnumber"));
				t.setCtransfer_balance(res.getInt("ctransfer_balance"));
				
				t_list.add(t);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t_list;
	}



}
