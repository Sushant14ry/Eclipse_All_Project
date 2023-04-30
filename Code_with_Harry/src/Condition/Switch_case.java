package Condition;

public class Switch_case {
	public static void main(String[] args) {
		char var = 'a';
		
		switch(var) {
			case 'a' -> System.out.println("You are Adult");
			case 's' -> System.out.println("Job Ready");
			case 'c' -> System.out.println("Senior Citizen");
			default -> System.out.println("Enjoy your Life !");
		}
	}
}
