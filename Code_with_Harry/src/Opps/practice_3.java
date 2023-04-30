package Opps;
/*
 * 3.	Create a class square with a method to initialize it’s side, calculating area , Parimeter etc.
 * 
 */
class Square{
	int side;
	public int area() {
		return side * side;
	}
	public int perimeter() {
		return 4*side;
	}
}
public class practice_3 {
	public static void main(String[] args) {
		Square sq = new Square();
		
		sq.side = 3;
		System.out.println("Area : "+sq.area());
		System.out.println("Perimeter : "+sq.perimeter());
	}
}
