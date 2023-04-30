package Condition;

import java.util.Scanner;

/*
 * 2.	Write a program to find out whether a Student is pass or fail ; if it requires total 40% and at least 33% in each subject to pass. Assume 3 Subjects and take marks as an input from the user. 
 * 
 */
public class practice_2 {
	public static void main(String[] args) {
		
		byte m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks Physics : ");
		m1 = sc.nextByte();
		
		System.out.println("Enter Your Marks Mathematics : ");
		m2 = sc.nextByte();
		
		System.out.println("Enter Your Marks English : ");
		m3 = sc.nextByte();
		
		float avg = (m1+m2+m3)/3.0f;
		System.out.println("You Got : "+avg+" %");
		
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("Congrates, You Pass");
		}else {
			System.out.println("Sorry, You Fail");
		}
	}
}
