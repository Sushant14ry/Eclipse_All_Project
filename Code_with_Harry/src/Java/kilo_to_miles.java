package Java;

import java.util.Scanner;

public class kilo_to_miles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Kilometers : ");
		float kilo = sc.nextFloat();
		
		double miles = 0.621371*kilo;
		
		System.out.println(kilo+" = "+miles);
	}
}
