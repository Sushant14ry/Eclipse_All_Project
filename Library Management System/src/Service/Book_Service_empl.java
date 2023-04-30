package Service;

import java.awt.Taskbar.State;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.Db;
import Model.Book;

public class Book_Service_empl implements Book_Service {

	@Override
	public boolean AddBook(Book bk) {
		
		String addbook = "INSERT INTO `new_book`(`bid`, `book_name`, `book_edition`, `book_publisher`, `book_price`, `book_page`, `book_writter`) values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDb().prepareStatement(addbook);
			
			pstm.setInt(1, bk.getBid());
			pstm.setString(2, bk.getBookname());
			pstm.setString(3, bk.getBookedition());
			pstm.setString(4, bk.getBookpublisher());
			pstm.setString(5, String.valueOf(bk.getBookprice()));
			pstm.setString(6, String.valueOf(bk.getBookpage()));
			pstm.setString(7, bk.getBookwriter());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DelBook(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Upd_Book(Book bk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getBookById(int id) {
		
		Book bk = new Book();
		
		String SelectBook = "SELECT * FROM `new_book` where bid ="+id;
		
		try {
			Statement stm = Db.getDb().createStatement();
			ResultSet result = stm.executeQuery(SelectBook);
			
			if(result.next()) {
				
				bk.setBookname(result.getString("book_name"));
				bk.setBookedition(result.getString("book_edition"));
				bk.setBookpublisher(result.getString("book_publisher"));
				bk.setBookprice(result.getInt("book_price"));
				bk.setBookpage(result.getInt("book_page"));
				bk.setBookwriter(result.getString("book_writter"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bk;
	}

	@Override
	public List<Book> GetAllBook() {
		List<Book> b_list = new ArrayList();
		
		String All_Books = "select * from new_book";
		
		try {
			Statement stm = Db.getDb().createStatement();
			ResultSet res = stm.executeQuery(All_Books);
			
			while(res.next()) {
				Book b = new Book();
				
				b.setBid(res.getInt("bid"));
				b.setBookname(res.getString("book_name"));
				b.setBookedition(res.getString("book_edition"));
				b.setBookpublisher(res.getString("book_publisher"));
				b.setBookprice(res.getInt("book_price"));
				b.setBookpage(res.getInt("book_page"));
				b.setBookwriter(res.getString("book_writter"));
				
				b_list.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b_list;
	}

	@Override
	public List<Book> SearchBook(String searchbook) {
		List<Book> b_list = new ArrayList();
		
		String All_Books = "select * from new_book where bid like '%"+searchbook+"%' OR book_name like '%"+searchbook+"%' OR book_writter like '%"+searchbook+"%' ";
		
		try {
			Statement stm = Db.getDb().createStatement();
			ResultSet res = stm.executeQuery(All_Books);
			
			while(res.next()) {
				Book b = new Book();
				
				b.setBid(res.getInt("bid"));
				b.setBookname(res.getString("book_name"));
				b.setBookedition(res.getString("book_edition"));
				b.setBookpublisher(res.getString("book_publisher"));
				b.setBookprice(res.getInt("book_price"));
				b.setBookpage(res.getInt("book_page"));
				b.setBookwriter(res.getString("book_writter"));
				
				b_list.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b_list;
	}

}