package Service;

import java.util.List;

import model.Account;

public interface Account_Service {
	boolean CreateAcc(Account acc);
	
	boolean DelAcc(int id);
	
	boolean UpdAcc(Account acc);
	
	boolean Upd_balance(Account acb);
	
	boolean Loging (int num, int sec_pinn);
	
	boolean ChangePin(Account ac_pin);
	
	Account getAccById(String bid);
	
	List<Account> getAllAcc();
	
	List<Account> SearchAcc(String s_acc);
}
