package Condition;

public class else_clause {
	public static void main(String[] args) {
		int age = 34;
		System.out.println("User Age : "+age);
		if(age>56) {
			System.out.println("You are Experience !");
		}else if(age>46) {
			System.out.println("You are Semi-experienced !");
		}else if(age>36) {
			System.out.println("You are Semi-semi-experienced !");
		}else {
			System.out.println("You are not experienced !");
		}
	}
}
