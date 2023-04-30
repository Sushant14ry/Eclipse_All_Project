package Arrays;
/*
 * 5.	Write a program to reverse an array.
 * 
 */
public class practice_5 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		for(int el : arr) {
			System.out.println("Before : "+el);
		}
		for(int i=0; i<n; i++) {
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		for(int element : arr) {
			System.out.println("After : "+element);
		}
	}
}
