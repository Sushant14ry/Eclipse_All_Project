package Opps_3;

interface Bicycle{
	int a = 45;
	void apply_brack(int decrement);
	void Speed_up(int increment);
}
interface Horron_Bicycle{
	void blow_horronK3g();
	void blow_horronpp();
}
class Avon_cycle implements Bicycle,Horron_Bicycle{
	void blow_horron() {
		System.out.println("Pee Pee Poo Poo");
	}
	public void apply_brack(int decrement) {
		System.out.println("Applying Brake");
	}
	public void Speed_up(int increment) {
		System.out.println("Applying Speed_UP");
	}
	public void blow_horronK3g(){
		System.out.println("Kabhi Khusi Kabhi Gum peee pee");
	}
	public void blow_horronpp(){
		System.out.println("Main Hoon Na Poo Poo");
	}
}
public class interfacess {
	public static void main(String[] args) {
		Avon_cycle ch = new Avon_cycle();
		ch.apply_brack(3);
		System.out.println(ch.a);
		
		ch.blow_horronK3g();
		ch.blow_horron();
		
		
	}
}
