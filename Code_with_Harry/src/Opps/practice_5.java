package Opps;
/*
 * 5.	Create a class TommyVecetti for Rockstar Games capable of hiting ( Print hiting….) , running , firing etc.
 */
class Tommy{
	public void hit() {
		System.out.println("Hitting the Enemy");
	}
	public void run() {
		System.out.println("Running from the Enemy");
	}
	public void fire() {
		System.out.println("Firing on the Enemy");
	}
}
public class practice_5 {
	public static void main(String[] args) {
		Tommy player1 = new Tommy();
		
		player1.fire();
		player1.hit();
		player1.run();
	}
}
