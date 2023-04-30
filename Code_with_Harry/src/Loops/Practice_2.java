package Loops;
/*
 * 2.	Write a program to sum first n even numbers using while loop.
 */
public class Practice_2 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 4;
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				System.out.println("even "+i);
			}
			sum = sum+i;
		}
		System.out.println("Sum of Even Num : "+sum);	
	}
}
