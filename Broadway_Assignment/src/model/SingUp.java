package model;

import java.sql.Date;

public class SingUp {
	private String fname;
	private String lname;
	private String username;
	private String psw;
	private String re_psw;
	private Date dob;
	private String address;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getRe_psw() {
		return re_psw;
	}
	public void setRe_psw(String re_psw) {
		this.re_psw = re_psw;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
