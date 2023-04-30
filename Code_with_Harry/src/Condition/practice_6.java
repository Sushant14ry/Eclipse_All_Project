package Condition;

/*
 *  6.	Write a Program to out the type of website from the url.
		.com  -->  Commercial Website
		.org  -->  Organization Website
		.in   -->  Indian Website	
 * 
 */
import java.util.Scanner;
public class practice_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Website Name");
		String website = sc.next();
		if(website.endsWith(".org")) {
			System.out.println("Organization Website");
		}else if(website.endsWith(".com")) {
			System.out.println("Commercial Website");
		}else if(website.endsWith(".in")) {
			System.out.println("Indian Website");
		}else {
			System.out.println("Domain Not Found !!");
		}
	}
}
