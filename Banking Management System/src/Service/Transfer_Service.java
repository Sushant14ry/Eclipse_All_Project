package Service;

import java.util.List;

import model.Transfer;

public interface Transfer_Service {
	boolean Add_Transfer_Balance(Transfer trf);

	List<Transfer> getAllTransferData();
	
	List<Transfer> To_SearchTransferData(String S_t_trans);
	List<Transfer> From_SearchTransferData(String S_f_trans);
}
