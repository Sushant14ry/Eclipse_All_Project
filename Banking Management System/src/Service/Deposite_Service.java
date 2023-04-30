package Service;

import java.util.List;

import model.Deposite;

public interface Deposite_Service {
	boolean Add_Deposite_Amount(Deposite dep);
	
	List<Deposite> Show_All_Deposite();
	
	List<Deposite> Search_All_Deposite(String S_dep);
}
