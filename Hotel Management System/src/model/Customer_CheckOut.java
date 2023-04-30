package model;

import java.sql.Date;

public class Customer_CheckOut {
	private int cid;
	private int room_no;
	private String customer_name;
	private Date checkdate;
	private String checkdate_today;
	private String mobile_num;
	private String gender;
	private int per_day;
	private int no_days;
	private int total_amount;
	private String email;
	private String room_type;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Date getCheckdate() {
		return checkdate;
	}
	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}
	public String getCheckdate_today() {
		return checkdate_today;
	}
	public void setCheckdate_today(String checkdate_today) {
		this.checkdate_today = checkdate_today;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPer_day() {
		return per_day;
	}
	public void setPer_day(int per_day) {
		this.per_day = per_day;
	}
	public int getNo_days() {
		return no_days;
	}
	public void setNo_days(int no_days) {
		this.no_days = no_days;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	
	
}
