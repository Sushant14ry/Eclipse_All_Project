package Opps;
/*
 * 1.	Create a class Rectangle 8 repeat 3.
 */
class Rectangle{
	int length;
	int breadth;
	
	public int area() {
		return length * breadth;
	}
	public int perimeter() {
		return 2*length+breadth;
	}
}
public class practice_4 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		
		rec.breadth = 6;
		rec.length = 4;
		
		System.out.println("Area : "+rec.area());
		System.out.println("Perimeter : "+rec.perimeter());
	}
}
