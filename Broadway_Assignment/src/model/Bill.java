package model;

import java.sql.Date;

public class Bill {
	private int bill_no;
	private String CustomerName;
	private int prod_id;
	private String ProductName;
	private int prod_mrp;
	private int prod_qty;
	private int prod_disc;
	private String date;
	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProd_mrp() {
		return prod_mrp;
	}
	public void setProd_mrp(int prod_mrp) {
		this.prod_mrp = prod_mrp;
	}
	public int getProd_qty() {
		return prod_qty;
	}
	public void setProd_qty(int prod_qty) {
		this.prod_qty = prod_qty;
	}
	public int getProd_disc() {
		return prod_disc;
	}
	public void setProd_disc(int prod_disc) {
		this.prod_disc = prod_disc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}