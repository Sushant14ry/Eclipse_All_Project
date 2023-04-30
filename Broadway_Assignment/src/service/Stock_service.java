package service;

import java.util.List;

import model.Stock;

public interface Stock_service {
	
	boolean AddStock(Stock stk);
	boolean DelStock(int id);
	boolean UpdStock(Stock stk);
	
	Stock getStockId(int id);
	
	List<Stock> getStocks();
	List<Stock> SearchStock(String s_stk);
}
