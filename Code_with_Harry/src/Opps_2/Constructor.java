package Opps_2;

class MyMainEmployee{
	private int id;
	private String name;
	
	public MyMainEmployee() {
		id = 8;
		name = "Alex";
	}
	
	public MyMainEmployee(String myName,int myId) {
		id = myId;
		name = myName;
	}
	
	public MyMainEmployee(String myName) {
		id = 4;
		name = myName;
	}
	
	public String getName() { 
		return name; 
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setId(int i) { 
		this.id = i; 
	}
	public int getId() {             
		return id; 
	}
}

public class Constructor {
	public static void main(String[] args) {
		MyMainEmployee nam = new MyMainEmployee("Kshitize");
		
		System.out.println(nam.getId()); 
		System.out.println(nam.getName());
	}
}
