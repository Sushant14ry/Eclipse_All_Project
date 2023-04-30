package Service;

import java.util.List;

import model.Customer_CheckIN;

public interface Check_In_Service {
	boolean AddCheckIN(Customer_CheckIN cci);
	
	boolean DelCheckIN(int id);
	
	boolean UpdCheckIN(Customer_CheckIN cci);
	
	Customer_CheckIN getCustomerById(int id);
	
	List<Customer_CheckIN> getAllCheck_In_Customer();
	
	List<Customer_CheckIN> Search_CheckIn_Customer(String s_checkIn);
}
