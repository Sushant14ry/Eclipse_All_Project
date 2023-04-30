package Opps_2;

import java.util.Random;
import java.util.Scanner;
class Game{
	public int number;
	public int input_num;
	public int num_of_gueses = 0;

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNum_of_gueses() {
		return num_of_gueses;
	}
	public void setNum_of_gueses(int num_of_gueses) {
		this.num_of_gueses = num_of_gueses;
	}
	
    Game() {
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	void take_user_input() {
		System.out.println("Guess the Number : ");
		Scanner sc = new Scanner(System.in);
		input_num = sc.nextInt();
	}
	boolean isCorrectNumber(int num) {
		num_of_gueses++;
		if(input_num == number) {
			System.out.format("Yes You Guessed , Right it was %d \nYou guessed in %d Attempts ",number,num_of_gueses);
			return true;
		}else if(input_num<number) {
			System.out.println("Too Low....");
		}else if(input_num>number) {
			System.out.println("Too High....");
		}
		return false;	
	}
}

public class Exercise_3_guess_number {
	public static void main(String[] args) {
		Game g = new Game();
		boolean b = false;
		while(!b) {
			g.take_user_input();
			b = g.isCorrectNumber(0);
		}
		 
	}
}
