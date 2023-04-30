package Loops;
/*
 * 5.	Write a program to find factorial of a given number using for loops.
 * 
 */
public class Practice_6 {
	public static void main(String[] args) {
		int n = 5;
//		int i = 1;
		int factorial = 1;
		
		// Using While Loop
//		while(i<=n) {
//			factorial *= i;
//			System.out.println(n+" Factorial Num : "+factorial);
//			i++;
//		}
//		System.out.println("Factorial Num : "+factorial);
		
//		Using For Loop
		for(int i=1; i<=n; i++) {
			factorial *= i;
			System.out.println(n+" Factorial Num : "+factorial);
		}
		System.out.println("Factorial Num : "+factorial);
	}
}
