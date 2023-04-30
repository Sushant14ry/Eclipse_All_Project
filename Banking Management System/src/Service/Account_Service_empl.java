package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.db;
import model.Account;

public class Account_Service_empl implements Account_Service {

	@Override
	public boolean CreateAcc(Account acc) {
		String Create_acc = "INSERT INTO `create_acc`(`fullname`, `number`, `address`, `balance`, `dob`, `religions`, `aac_no`, `micr_no`, `sec_qstn`, `acc_type`, `gender`, `sec_ans`, `pin_no`,`username`,`nomination`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(Create_acc);
			pstm.setString(1, acc.getFullname());
			pstm.setString(2, acc.getNumber());
			pstm.setString(3, acc.getAddress());
			pstm.setInt(4, acc.getBalance());
			pstm.setDate(5, acc.getDob());
			pstm.setString(6, acc.getReligions());
			pstm.setString(7, acc.getAac_no());
			pstm.setString(8, acc.getMicr_no());
			pstm.setString(9, acc.getSec_qstn());
			pstm.setString(10, acc.getAcc_type());
			pstm.setString(11, acc.getGender());
			pstm.setString(12, acc.getSec_ans());
			pstm.setInt(13, acc.getPinno());
			pstm.setString(14, acc.getUsername());
			pstm.setString(15, acc.getNomination());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DelAcc(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdAcc(Account acc) {
		
		String upd_acc = "update create_acc set fullname =?,number =?, `address` =?,`username` =?, `dob` =?, `religions` =?,`micr_no` =?, `sec_ans` =?, `acc_type` =?, `gender` =?,`pin_no` =? where  `aac_no` =? ";
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(upd_acc);
			pstm.setString(1, acc.getFullname());
			pstm.setString(2, acc.getNumber());
			pstm.setString(3, acc.getAddress());
			pstm.setString(4, acc.getUsername());
			pstm.setDate(5, acc.getDob());
			pstm.setString(6, acc.getReligions());
			
			
			pstm.setString(7, acc.getMicr_no());
			pstm.setString(8, acc.getSec_ans());
			pstm.setString(9, acc.getAcc_type());
			pstm.setString(10, acc.getGender());
			pstm.setInt(11, acc.getPinno());
			pstm.setString(12, acc.getAac_no());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Account getAccById(String bid) {
		Account ac = new Account();
		String find_acc = "select * from create_acc where aac_no='"+bid+"' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(find_acc);
			
			if(res.next()) {		
				ac.setFullname(res.getString("fullname"));
				ac.setNumber(res.getString("number"));
				ac.setAddress(res.getString("address"));
				ac.setBalance(res.getInt("balance"));
				ac.setDob(res.getDate("dob"));
				ac.setReligions(res.getString("religions"));
				ac.setUsername(res.getString("username"));
				ac.setNomination(res.getString("nomination"));

				ac.setAac_no(res.getString("aac_no"));
				ac.setMicr_no(res.getString("micr_no"));
				ac.setRandom(res.getInt("pin_no"));
				ac.setAcc_type(res.getString("acc_type"));
				ac.setGender(res.getString("gender"));
				ac.setSec_ans(res.getString("sec_ans"));
				ac.setSec_qstn(res.getString("sec_qstn"));

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ac;
	}

	@Override
	public List<Account> getAllAcc() {
		List<Account> ac_list = new ArrayList();
		
		String show_acc = "select * from create_acc";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(show_acc);
			
			while(res.next()) {
				Account ac = new Account();
				
				ac.setAac_no(res.getString("aac_no"));
				ac.setFullname(res.getString("fullname"));
				ac.setDob(res.getDate("dob"));
				ac.setAcc_type(res.getString("acc_type"));
				ac.setGender(res.getString("gender"));
				ac.setNumber(res.getString("number"));
				ac.setAddress(res.getString("address"));
				
				ac_list.add(ac);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ac_list;
	}

	@Override
	public List<Account> SearchAcc(String s_acc) {
		List<Account> ac_list = new ArrayList();
		
		String Search_acc = "select * from create_acc where aac_no like '%"+s_acc+"%' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			ResultSet res = stm.executeQuery(Search_acc);
			
			while(res.next()) {
				Account ac = new Account();
				
				ac.setAac_no(res.getString("aac_no"));
				ac.setFullname(res.getString("fullname"));
				ac.setDob(res.getDate("dob"));
				ac.setAcc_type(res.getString("acc_type"));
				ac.setGender(res.getString("gender"));
				ac.setNumber(res.getString("number"));
				ac.setAddress(res.getString("address"));
				
				ac_list.add(ac);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ac_list;
	}

	@Override
	public boolean ChangePin(Account ac_pin) {
		Account ac = new Account();
		
		String Change_pin = "update create_acc set pin_no =? where aac_no =? ";
		
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(Change_pin);
			
			pstm.setInt(1,ac_pin.getRandom());
			pstm.setString(2, ac_pin.getAac_no());
			
			pstm.execute();
			return true;
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Upd_balance(Account acb) {
		Account ac = new Account();
		
		String upd_balance = "update create_acc set balance =? where aac_no =? ";
		
		try {
			PreparedStatement pstm = db.getDb().prepareStatement(upd_balance);
			
			pstm.setInt(1,acb.getBalance());
			pstm.setString(2,acb.getAac_no());
			
			pstm.execute();
			return true;
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Loging(int num, int sec_pinn) {
		
		String Login = "select * from create_acc where number='"+num+"' and pin_no='"+sec_pinn+"' ";
		
		try {
			Statement stm = db.getDb().createStatement();
			stm.execute(Login);
			return true ;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
