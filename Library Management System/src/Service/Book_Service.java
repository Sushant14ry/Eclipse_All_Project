package Service;

import java.util.List;

import Model.Book;

public interface Book_Service {
	boolean AddBook(Book bk);
	
	boolean DelBook(int id);
	
	boolean Upd_Book(Book bk);
	
	Book getBookById(int id);
	
	List<Book> GetAllBook();
	List<Book> SearchBook(String searchbook);
}
