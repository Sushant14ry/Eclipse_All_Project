package String;
/*
 * 5.	Write a program to format the following letter using escape sequence characters.
		Letter  =  “ Dear Sushant , This java Course is nice Thanks “
 * 
 */
public class practice_5 {
	public static void main(String[] args) {
		String letter = "Does Sushant, This Java Course is nice Thanks";
		System.out.println(letter);
		System.out.println("---------------");
		
		String letters = "Dear Sushant, \n \t This Java Course is nice. \n Thanks";
		System.out.println(letters);
		
	}
}
