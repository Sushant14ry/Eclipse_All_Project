package service;

import java.util.List;

import model.Bill;

public interface Bill_Service {
	boolean addBill(Bill bl);
	
	boolean removeBill(int id);
	
	Bill getBill_Id(int id);
	
	List<Bill> getAllBills();
	
	List<Bill> Search_bill(String s_bill);
	
	
}
