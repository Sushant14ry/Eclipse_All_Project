package Service;

import java.util.List;

import Model.Payment;

public interface Payment_Service {
	boolean PayPayment(Payment pay);
	boolean DelPayment(int pid);
	boolean UpdPayment(Payment py);
	
	Payment GetPaymentById(int pid);
	
	List<Payment> GetAllPayment();
	
	List<Payment> UserPayment(int mid);
}
