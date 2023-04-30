package Opps_2;

class myEmployee{
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int setId(int i ) {
		return id = i;
	}
	public int getId() {
		return id;
	}
	
}
public class Access_modifier {
	public static void main(String[] args) {
		myEmployee nm = new myEmployee();
		
		nm.setId(12);
		nm.setName("Sushant Chaudhary");
		
		System.out.println(nm.getId());
		System.out.println(nm.getName());
	}
}
