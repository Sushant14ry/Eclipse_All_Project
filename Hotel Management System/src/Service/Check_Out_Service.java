package Service;

import java.util.List;

import model.Customer_CheckOut;

public interface Check_Out_Service {
	boolean AddCheckOut(Customer_CheckOut cco);
	
	boolean DelCheckOut(int id);
	
	boolean UpdCheckOut(Customer_CheckOut cco);
	
	Customer_CheckOut getCustomerById(int id);
	
	List<Customer_CheckOut> getAllCheck_Out_Customer();
	
	List<Customer_CheckOut> Search_CheckOut_Customer(String s_checkOut);
}
