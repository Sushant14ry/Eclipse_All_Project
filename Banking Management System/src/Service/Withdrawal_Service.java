package Service;

import java.util.List;

import model.Withdrawal;

public interface Withdrawal_Service {
	boolean Add_Withdrawa_Amount(Withdrawal with);
	
	List<Withdrawal> Show_withdrawal_Amount();
	List<Withdrawal> Search_withdrawal_Amount(String S_with);
}
