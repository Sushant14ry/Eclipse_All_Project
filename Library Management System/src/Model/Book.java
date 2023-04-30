package Model;

import java.sql.Date;

public class Book {
	
	private int bid;
	private String bookname;
	private String bookedition;
	private String bookpublisher;
	private int bookprice;
	private int bookpage;
	private String bookwriter;
	private Date issue_date;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookedition() {
		return bookedition;
	}
	public void setBookedition(String bookedition) {
		this.bookedition = bookedition;
	}
	public String getBookpublisher() {
		return bookpublisher;
	}
	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public int getBookpage() {
		return bookpage;
	}
	public void setBookpage(int bookpage) {
		this.bookpage = bookpage;
	}
	public String getBookwriter() {
		return bookwriter;
	}
	public void setBookwriter(String bookwriter) {
		this.bookwriter = bookwriter;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	
	
	
}
