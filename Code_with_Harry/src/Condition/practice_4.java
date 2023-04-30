package Condition;

/*
 * 4. Write a java program to find out the day of the week given the number [ 1 for Monday, 2 for Tuesday,……. And so on ! ]
 * 
 */
import java.util.Scanner;
public class practice_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day in number : ");
		int var = sc.nextInt();
		switch(var) {
			case 1 -> System.out.println("Sunday");
			case 2 -> System.out.println("Monday");
			case 3 -> System.out.println("Tuesday");
			case 4 -> System.out.println("Wednesday");
			case 5 -> System.out.println("Thursday");
			case 6 -> System.out.println("Friday");
			case 7 -> System.out.println("Saturday");
		}
	}
}
