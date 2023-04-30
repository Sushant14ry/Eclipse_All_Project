package Service;

import java.util.List;

import model.Account;

public interface Account_Service {
	boolean CreateAcc(Account acc);
	
	boolean DelAcc(int id);
	
	boolean UpdAcc(Account acc);
	
	Account getAccById(String bid);
	
	List<Account> getAllAcc();
	
	List<Account> SearchAcc(String s_acc);
}
