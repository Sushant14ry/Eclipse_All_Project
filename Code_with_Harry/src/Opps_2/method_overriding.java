package Opps_2;

class A{
	public int a;
	public int num() {
		return 4;
	}
	public void mth2() {
		System.out.println("I'm Method-2 class of A");
	}
}

class B extends A{
	public void mth2() {
		System.out.println("I'm Method-2 class of B");
	}
	public void mth3() {
		System.out.println("I'm Method-3 class of B");
	}
}
public class method_overriding {
	public static void main(String[] args) {
		A a = new A();
		a.mth2();
		
		B b = new B();
		b.mth2();
		
	}
}
