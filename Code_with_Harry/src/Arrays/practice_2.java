package Arrays;
/*
 * 2.	Write a program to find out whether a given integer is present in an array or not.
 * 
 */
public class practice_2 {
	public static void main(String[] args) {
		float [] marks = {45.7f,54.6f,76.4f,52.3f,64.6f,23.4f};
		float num = 54.6f;
		boolean isInArray = false;
		for(float element : marks) {
			if(num == element) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
			System.out.println(num+" : The Value is Present in Array");
		}else {
			System.out.println(num+" : The Value is not Present in Array");
		}
	}
}
