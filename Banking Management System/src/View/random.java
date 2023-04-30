package View;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		
		Random dice = new Random();
		int num;
		
		for(int count=1; count<=6; count++) {
			num = 1+dice.nextInt(9);
			System.out.print(num);
		}
	}
}
