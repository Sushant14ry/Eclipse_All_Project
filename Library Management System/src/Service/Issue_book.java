package Service;

import java.util.List;

import Model.Issue_Book;

public interface Issue_book {
	boolean AddIssue_book(Issue_Book isb);
	
	boolean DeleteIssue_book(int id);
	
	boolean upd_Issue_book(Issue_Book isb);
	
	Issue_Book getIssue_bookById(int id);
	
	List<Issue_Book> GetAllIssue_book();
	List<Issue_Book> Search_ssue_book(Issue_Book s_Issue_Book);
}
