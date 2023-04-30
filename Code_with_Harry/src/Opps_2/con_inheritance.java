package Opps_2;

class base1{
	base1(){
		System.out.println("I'm a base Constructor");
	}
	base1(int a ){
		System.out.println("I'm a Overloaded Constructor \n with Value of a : "+a);
	}
}

class Derived1 extends base1{
	 Derived1() {
		System.out.println("I'm a derived Constructor");
	 } 
	Derived1(int a, int b){
		super(a);
		System.out.println("I'm a Overloaded Constructor \n derived with Value of a & b as : "+b);
	}
}

class childDerived extends Derived1{
	public childDerived() {
		System.out.println("Child of Derived Constructor");
	}
	public childDerived(int a, int b,int c) {
		super(a,b);
		System.out.println("I'm a Overloaded Constructor \n derived with Value of c as : "+c);
	}
}

public class con_inheritance {
	public static void main(String[] args) {
		
		childDerived cd = new childDerived(12,16,13);
		
	}
}
