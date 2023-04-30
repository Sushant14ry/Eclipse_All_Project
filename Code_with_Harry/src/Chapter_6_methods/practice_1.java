package Chapter_6_methods;
/*
 *  1.	Write a  Java Method to print multiplication table of a number n.
 */
public class practice_1 {
	static void multiplication(int n) {
		for(int i=1; i<=n; i++) {
			System.out.format("%d X %d = %d \n",n,i,n*i);
		}
	}
	
	public static void main(String[] args) {
		multiplication(8);
	}
}
