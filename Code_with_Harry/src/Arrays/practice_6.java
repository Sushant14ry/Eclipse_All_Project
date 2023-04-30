package Arrays;
/*
 * 6.	Write a java program to find the minimum element in a Java Array. 
 * 
 */
public class practice_6 {
	public static void main(String[] args) {
		int [] arr = {91,22,63,47,53,62};
		int max = 0;
		for(int e:arr) {
			if(e>max) {
				max = e;
			}
		}
		System.out.println("Maximum Value of Array : "+max);
	}
}
