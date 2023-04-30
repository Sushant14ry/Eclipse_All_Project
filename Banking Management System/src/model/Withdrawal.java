package model;

public class Withdrawal {
	private int wid;
	private String acc_number;
	private String fullname;
	private String username;
	private String number;
	private int av_balance;
	private int with_balance;
	private int total_amount;
	
	public String getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAv_balance() {
		return av_balance;
	}
	public void setAv_balance(int av_balance) {
		this.av_balance = av_balance;
	}
	public int getWith_balance() {
		return with_balance;
	}
	public void setWith_balance(int with_balance) {
		this.with_balance = with_balance;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	
	
}
