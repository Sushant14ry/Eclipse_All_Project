package Loops;
/*
 * 1.	Write a program to print the following pattern.
			****
			***
			**
			*
 */
public class Practice_1 {
	public static void main(String[] args) {
//		int n = 4;
		
//		Using For Loop
//		for(int i=n ; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
//		Using While Loop
		int n = 4;
		int i = n;
		int j = 0;
		
		while(i>0) {
			while(j<i) {
				j--;
				System.out.print("*");
				j--;
			}
			System.out.println("\n");
		}
	}
}
