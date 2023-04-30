package model;

public class Stock {
	private int pid;
	private String pname;
	private int pqty;
	private int pnqty;
	private int pmrp;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	public int getPnqty() {
		return pnqty;
	}
	public void setPnqty(int pnqty) {
		this.pnqty = pnqty;
	}
	public int getPmrp() {
		return pmrp;
	}
	public void setPmrp(int pmrp) {
		this.pmrp = pmrp;
	}
	
}
