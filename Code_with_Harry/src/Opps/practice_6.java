package Opps;

class Circle{
	int r;
	double pi = 3.14;
	
	public int area() {
		return (int) (pi*r*r);
	}

}
public class practice_6 {
	public static void main(String[] args) {
		Circle cl = new Circle();
		
		cl.r = 8;
		System.out.println("Circle Area : "+cl.area());
	}
}
