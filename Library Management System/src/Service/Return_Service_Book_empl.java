package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Connection.Db;
import Model.Issue_Book;
import Model.Return_book;

public class Return_Service_Book_empl implements Return_Book_Service {

	@Override
	public boolean AddReturnBook(Return_book rsk) {
		
		String return_book = "INSERT INTO `return_book`(`bid`, `book_name`, `book_edition`, `book_publisher`, `book_price`, `book_page`, `book_writter`, `issue_date`, `sid`, `fullname`, `fathername`, `course`, `branch`, `year`, `semester`, `return_date`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDb().prepareStatement(return_book);
			
			pstm.setString(1, String.valueOf(rsk.getBid()));
			pstm.setString(2, rsk.getBookname());
			pstm.setString(3, rsk.getBookedition());
			pstm.setString(4, rsk.getBookpublisher());
			pstm.setString(5, String.valueOf(rsk.getBookprice()));
			pstm.setString(6, String.valueOf(rsk.getBookpage()));
			pstm.setString(7, rsk.getBookwriter());
			pstm.setDate(8, rsk.getIssue_date());
			pstm.setString(9, String.valueOf(rsk.getSid()));
			pstm.setString(10, rsk.getFullname());
			pstm.setString(11, rsk.getFathername());
			pstm.setString(12, rsk.getCourse());
			pstm.setString(13, rsk.getBranch());
			pstm.setString(14, rsk.getYear());
			pstm.setString(15, rsk.getSemester());
			pstm.setDate(16, rsk.getReturn_date());
	
			pstm.execute();
			return true;	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return false;
	}

	@Override
	public boolean DeleteReturnBook(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upd_ReturnBook(Return_book rsk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Return_book getIReturnBookById(int id) {
		Return_book rb = new Return_book();
		
		String std_book_details = "select * from issue_book where sid="+id;
		
		try {
			Statement stm = Db.getDb().createStatement();
			ResultSet res = stm.executeQuery(std_book_details);
			
			if(res.next()) {
				
//				Show Student Details
				rb.setFullname(res.getString("fullname"));
				rb.setFathername(res.getString("fathername"));
				rb.setCourse(res.getString("course"));
				rb.setBranch(res.getString("branch"));
				rb.setYear(res.getString("year"));
				rb.setSemester(res.getString("semester"));
				
				
				// Show Book Details
				rb.setBid(res.getInt("bid"));
				rb.setBookname(res.getString("book_name"));
				rb.setBookedition(res.getString("book_edition"));
				rb.setBookpublisher(res.getString("book_publisher"));
				rb.setBookprice(res.getInt("book_price"));
				rb.setBookpage(res.getInt("book_page"));
				rb.setBookwriter(res.getString("book_writter"));
				rb.setIssue_date(res.getDate("issue_date"));
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rb;
	}

	@Override
	public List<Return_book> GetAllReturnBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Return_book> ReturnBook(Issue_Book s_Issue_Book) {
		// TODO Auto-generated method stub
		return null;
	}

}
