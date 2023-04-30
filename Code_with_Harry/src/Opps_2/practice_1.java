package Opps_2;

class Sphere{
	private int radius;

	public Sphere(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double AreaSphere() {
		return 4*Math.PI*radius*radius;
	}
	
}
public class practice_1 {
	public static void main(String[] args) {
		Sphere s = new Sphere(12);
		System.out.println("Radius : "+s.getRadius());
		System.out.println("Area : "+s.AreaSphere());
		
	}
}
