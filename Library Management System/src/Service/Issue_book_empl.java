package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Connection.Db;
import Model.Issue_Book;

public class Issue_book_empl implements Issue_book {

	@Override
	public boolean AddIssue_book(Issue_Book isb) {
		String book_issue = "INSERT INTO `issue_book`(`bid`, `book_name`, `book_edition`, `book_publisher`, `book_price`, `book_page`, `book_writter`, `sid`, `fullname`, `fathername`, `course`, `branch`, `year`, `semester`, `issue_date`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = Db.getDb().prepareStatement(book_issue);
			
			pstm.setInt(1, isb.getBid());
			pstm.setString(2, isb.getBookname());
			pstm.setString(3, isb.getBookedition());
			pstm.setString(4, isb.getBookpublisher());
			pstm.setInt(5, isb.getBookprice());
			pstm.setInt(6, isb.getBookpage());
			pstm.setString(7, isb.getBookwriter());
			
//			Student Section Start
			pstm.setInt(8, isb.getSid());
			pstm.setString(9, isb.getFullname());
			pstm.setString(10, isb.getFathername());
			pstm.setString(11, isb.getCourse());
			pstm.setString(12, isb.getBranch());
			pstm.setString(13, isb.getYear());
			pstm.setString(14, isb.getSemester());
			pstm.setDate(15, isb.getIssue_date());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean DeleteIssue_book(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upd_Issue_book(Issue_Book isb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Issue_Book getIssue_bookById(int id) {
		Issue_Book ib = new Issue_Book();
		
		String getIssue_Book = "SELECT * FROM `new_book` bid="+id;
		
		try {
			Statement stm = Db.getDb().createStatement();
			ResultSet res = stm.executeQuery(getIssue_Book);
			
			if(res.next()) {
				ib.setIssue_date(res.getDate("issue_date"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Issue_Book> GetAllIssue_book() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Issue_Book> Search_ssue_book(Issue_Book s_Issue_Book) {
		// TODO Auto-generated method stub
		return null;
	}

}
