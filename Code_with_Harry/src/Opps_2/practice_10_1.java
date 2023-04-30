package Opps_2;

class Circle{
	Circle(int r){
		System.out.println("I am Circle Parm Constructor ");
		this.radius = r;
	}
	public int radius;
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
}

class Cylinder1 extends Circle{
	public int heght;
	public Cylinder1(int r , int h) {
		super(r);
		System.out.println("I am Cylinder1 Parm Constructor ");
		this.heght = h;
	}
	public double volume() {
		return Math.PI*this.radius*this.heght*this.heght;
	}
}

public class practice_10_1 {
	public static void main(String[] args) {
		Cylinder1 obj1 = new Cylinder1(12, 4);
		
	}
}
