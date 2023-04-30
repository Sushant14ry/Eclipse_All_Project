package Java;

import java.util.Scanner;

public class print_name_great_wish {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Hello "+name+" , Have a good day");	
	}
}
