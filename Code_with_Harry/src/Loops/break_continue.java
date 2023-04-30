package Loops;

public class break_continue {
	public static void main(String[] args) {
		int i = 0;
		do{
			i++;
			if(i==2) {
				continue; 
			}
			System.out.println(i);
		}while(i<5);
		System.out.println("Ending Loop");
	}
}
