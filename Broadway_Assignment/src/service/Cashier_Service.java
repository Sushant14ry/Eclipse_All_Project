package service;

import java.util.List;

import model.Cashier;

public interface Cashier_Service {
	
	boolean AddCashier(Cashier cash);
	boolean DelCashier(int id);
	boolean UpdCashier(Cashier sup);
	
	Cashier getCashierUserId(int id);
	
	List<Cashier> getAllCashierUser();
	
	List<Cashier> SearchCashierUser(String S_user_cash);
}
