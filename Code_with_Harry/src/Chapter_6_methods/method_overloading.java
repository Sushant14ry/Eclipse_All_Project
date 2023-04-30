package Chapter_6_methods;

public class method_overloading {
	static void foo() {
		System.out.println("Good Morning Bro");
	}
	static void foo(int a) {
		System.out.println("Good Morning "+a+" bro");
	}
	static int foo(int a, int b) {
		System.out.println("Good Morning "+a+" bro " + b);
		return 3;
	}
	
	public static void main(String[] args) {
		foo();
		foo(300);
		foo(100,200);
	}	
}
