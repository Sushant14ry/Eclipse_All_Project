package Loops;
/*
 * 4.	Write a program to print multiplication table of  10 in reverse order.
 * 
 */
public class Practice_5 {
	public static void main(String[] args) {
		int n = 5;
	    for(int i=10; i>=1; i--) {
			System.out.printf("%d x %d = %d \n",n,i,n*i);
		}
	}
}
