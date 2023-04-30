package Opps_2;

class EkClass{
	int a;
	
	public int getA() {
		return a;
	}
	EkClass(int v){
		this.a = v;
		
	}
	public int returnOne(){
		return 1;
	}	
}

class DoClass extends EkClass{
	public DoClass(int c) {
		super(c);
		System.out.println("I'm Constructor");
	}
}

public class this_super {
	public static void main(String[] args) {
		EkClass ek = new EkClass(8);
		System.out.println(ek.getA());
		
		DoClass d = new DoClass(6);
		System.out.println(ek.getA());
	}
}
