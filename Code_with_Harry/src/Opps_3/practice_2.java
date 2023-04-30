package Opps_3;
/*
 * 3.	Create a class Monkey with jump( ) and bite( ) methods. Create a class Human which inherits this Money class and implements Basic Animal , interface with eat( )  and Sleep( )  methods.
 * 5.	Demonstrate Polymorphism using monkey class from Q3.
 */
class Monkey{
	void jump() {
		System.out.println("Jumping....");
	}
	void bite() {
		System.out.println("Biting....");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal{
	void speak() {
		System.out.println("Hello Sir !!");
	}

	@Override
	public void eat() {
		System.out.println("Eating....");	
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping....");
	}
}
public class practice_2 {
	public static void main(String[] args) {
		Human hmn = new Human();
		hmn.sleep();
		hmn.speak();
		System.out.println("---- Polymorphism ----");
		BasicAnimal ram = new Human();
		ram.sleep();
		ram.eat();
	}
}
