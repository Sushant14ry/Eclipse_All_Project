package Arrays;
/*
 * 8.	Write a java program to find whether an array is sorted or no. 
 * 
 */
public class practice_8 {
	public static void main(String[] args) {
		boolean isSorted = true;
		int [] arr = {2,5,8,9,10,14};
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("The Array is Sorted");
		}else {
			System.out.println("The Array is not Sorted");
		}
	}
}
