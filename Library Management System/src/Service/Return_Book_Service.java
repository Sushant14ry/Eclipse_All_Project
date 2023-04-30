package Service;

import java.util.List;

import Model.Issue_Book;
import Model.Return_book;

public interface Return_Book_Service {
	boolean AddReturnBook(Return_book rsk);
	
	boolean DeleteReturnBook(int id);
	
	boolean upd_ReturnBook(Return_book rsk);
	
	Return_book getIReturnBookById(int id);
	
	List<Return_book> GetAllReturnBook();
	List<Return_book> ReturnBook(Issue_Book s_Issue_Book);
}
