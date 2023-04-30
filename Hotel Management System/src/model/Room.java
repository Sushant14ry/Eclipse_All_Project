package model;

public class Room {
	private String room_no;
	private String room_type;
	private String no_of_bed;
	private int room_price;
	
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getNo_of_bed() {
		return no_of_bed;
	}
	public void setNo_of_bed(String no_of_bed) {
		this.no_of_bed = no_of_bed;
	}
	public int getRoom_price() {
		return room_price;
	}
	public void setRoom_price(int room_price) {
		this.room_price = room_price;
	}
}
