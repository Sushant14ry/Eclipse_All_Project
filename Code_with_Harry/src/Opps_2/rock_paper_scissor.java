package Opps_2;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for Rock \n Enter 1 for Paper \n enter 2 for Scissor");
		int userInput = sc.nextInt();
		
		Random rndm = new Random();
		int computer = rndm.nextInt(3);
		
		if(userInput == computer) {
			System.out.println("Draw");
		}else if( userInput == 0 && computer ==2 || userInput == 1  && computer == 0 || userInput == 2 && computer == 1) {
			System.out.println("You Win");
		}else {
			System.out.println("Computer Win");
		}
		
	}
}
