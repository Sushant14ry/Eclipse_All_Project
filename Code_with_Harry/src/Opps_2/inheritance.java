package Opps_2;

class Base{
	int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I'm Base and Seting x now");
		this.x = x;
	}

	public void printMe() {
		System.out.println("I'm Constructor");
	}
}

class Derived extends Base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class inheritance {
	public static void main(String[] args) {
		Base b = new Base();
		b.setX(4);
		System.out.println(b.getX()); 
		System.out.println("== Creating Object Derived Class ==");
		Derived d = new Derived();
		d.setX(5);
		System.out.println(d.getX());
	}
}
