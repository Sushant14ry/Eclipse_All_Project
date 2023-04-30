package model;

public class Transfer {
	private int tid;
	private String tacc_no;
	private String tfullname;
	private int tav_balance;
	private int ttransfer_amount;
	private int ttotal_amount;
	
	private String cacc_no;
	private String cfullname;
	private String cnumber;
	private int ctransfer_balance;
	
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTacc_no() {
		return tacc_no;
	}
	public void setTacc_no(String tacc_no) {
		this.tacc_no = tacc_no;
	}
	public String getTfullname() {
		return tfullname;
	}
	public void setTfullname(String tfullname) {
		this.tfullname = tfullname;
	}
	public int getTav_balance() {
		return tav_balance;
	}
	public void setTav_balance(int tav_balance) {
		this.tav_balance = tav_balance;
	}
	public int getTtransfer_amount() {
		return ttransfer_amount;
	}
	public void setTtransfer_amount(int ttransfer_amount) {
		this.ttransfer_amount = ttransfer_amount;
	}
	public int getTtotal_amount() {
		return ttotal_amount;
	}
	public void setTtotal_amount(int ttotal_amount) {
		this.ttotal_amount = ttotal_amount;
	}
	public String getCacc_no() {
		return cacc_no;
	}
	public void setCacc_no(String cacc_no) {
		this.cacc_no = cacc_no;
	}
	public String getCfullname() {
		return cfullname;
	}
	public void setCfullname(String cfullname) {
		this.cfullname = cfullname;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	public int getCtransfer_balance() {
		return ctransfer_balance;
	}
	public void setCtransfer_balance(int ctransfer_balance) {
		this.ctransfer_balance = ctransfer_balance;
	}
	
	
}
