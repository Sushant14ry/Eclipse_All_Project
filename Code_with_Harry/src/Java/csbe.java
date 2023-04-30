package Java;

import java.util.Scanner;

public class csbe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks Out of 100 !!!! \n");
		System.out.println("Enter English Subject Marks : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Math Subject Marks : ");
		int b = sc.nextInt();
		
		System.out.println("Enter Social Subject Marks : ");
		int c = sc.nextInt();
		
		System.out.println("Enter Physics Subject Marks : ");
		int d = sc.nextInt();
		
		System.out.println("Enter Chemistry Subject Marks : ");
		int e = sc.nextInt();
		
		int total = (a+b+c+d+e);
		int per = total*100/500;
		System.out.println("Percentage of 5 marks : "+per+" % ");
		
	}
}
