package Chapter_6_methods;
/*
 * 2.	Write a Program using function to print the following pattern.
			*
			**
			***
			****
			***** 
 */
public class practice_2 {
	static void pattern(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(4);
	}
}
