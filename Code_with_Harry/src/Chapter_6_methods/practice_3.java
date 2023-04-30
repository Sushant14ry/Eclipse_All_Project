package Chapter_6_methods;
/*
 *  3.	Write a recursive function to calculate sum of first n natural numbers.
 */
public class practice_3 {
	
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumRec(n-1);
	}
	public static void main(String[] args) {
		int c = sumRec(4);
		System.out.println(c);
	}
}
