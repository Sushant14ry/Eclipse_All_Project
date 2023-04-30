package Opps_3;

abstract class Parent{
	public Parent() {
		System.out.println("Parent Constructor");
	}
	public void SayHello() {
		System.out.println("Hello");
	}
	
	abstract public void greet();
	abstract public void greet2();
}

class Child2 extends Parent{
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
	@Override
	public void greet2() {
		System.out.println("Good Afternoon");
	}
}

abstract class Child3 extends Parent{
	public void th() {
		System.out.println("I am Good");
	}
}
public class abstracts {
	public static void main(String[] args) {
		Child2 c = new Child2();
		
		
	}
}
