package Opps_2;

class Phone{
	public void name() {
		System.out.println("Nokia 5500");
	}
	public void greets() {
		System.out.println("Good Morning");
	}
}

class SmartPhone extends Phone{
	public void name() {
		System.out.println("Nokia C2");
	}
	public void Swagat() {
		System.out.println("Swagat hai Aapka");
	}
}

public class dynamic_dispatch {
	public static void main(String[] args) {
		Phone obj = new SmartPhone();
		obj.name();
		obj.greets();
	}
}
