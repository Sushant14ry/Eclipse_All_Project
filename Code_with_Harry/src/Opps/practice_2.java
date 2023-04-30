package Opps;

/*
 * 2.	Create a class cellphone with methods to print ‘ ringing… ‘ ,  ‘ vibrating… ‘ ,  etc.
 * 
 */

class cellphone{
	public void ringing() {
		System.out.println("Ringing.......");
	}
	public void vibrating() {
		System.out.println("Vibrating......");
	}
	public void callfriend() {
		System.out.println("Calling my Friend");
	}
}

public class practice_2 {
	public static void main(String[] args) {
		cellphone asus = new cellphone();
		
		asus.callfriend();
		asus.vibrating();
		asus.ringing();
	}
	
}
