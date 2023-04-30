package Arrays;

public class practice_3 {
	public static void main(String[] args) {
		float [] marks = {45.7f,54.6f,76.4f,52.3f,64.6f,23.4f};
		float sum = 0;
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]);
			System.out.println(" ");
		}
		for(float element : marks) {
			sum = sum + element;
		}
		System.out.println("Value of Average marks is : "+sum/marks.length);
	}
}
