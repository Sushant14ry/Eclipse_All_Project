package Opps_3;

interface sample_interface{
	void math1();
	void math2();
}
interface childSampleInterface extends sample_interface{
	void math3();
	void math4();
}
class MySampleClass implements childSampleInterface{
	public void math1() {
		System.out.println("Math1");
	}
	public void math2() {
		System.out.println("Math2");
	}
	public void math3() {
		System.out.println("Math3");
	}
	public void math4() {
		System.out.println("Math4");
	}
}
public class inheritanc_interface {
	public static void main(String[] args) {
		MySampleClass obj = new MySampleClass();
		obj.math1();
		obj.math2();
		obj.math3();
		obj.math4();
	}
}
