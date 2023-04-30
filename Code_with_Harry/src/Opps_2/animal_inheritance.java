package Opps_2;

class Animal{
	int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		System.out.println("Animal has 4 Legs");
		this.leg = leg;
	}
}

class Dog extends Animal{
	int legs;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		System.out.println("Dog Barks Bhow , Bhow");
		this.legs = legs;
	}

}

public class animal_inheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.setLeg(4);
		System.out.println(d.getLeg());
		d.setLegs(0);
		System.out.println(d.getLegs());
	}	
}
