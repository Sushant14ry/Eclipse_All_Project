package Opps_3;
/*
 * 1.	 Create an abstract class Pen with methods write( )  and  refill( )  as abstract methods.
 * 2.	Use the Pen class  from  Q1 to create a Concrete class Fountain Pen with additional method changeNib( ).
 */

abstract class Pen{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen{
	void write() {
		System.out.println("Write");
	}
	void refill() {
		System.out.println("Refill");
	}
	void ChangeNib() {
		System.out.println("Changing NIB");
	}
}
public class practice_1 {
	public static void main(String[] args) {
		FountainPen pen = new FountainPen();
		pen.ChangeNib();
	}
}
