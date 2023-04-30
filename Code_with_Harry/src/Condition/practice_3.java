package Condition;

/*3.	 Calculate Income tax paid by an employee to the government as per the slaps below :
		Income Slaps		Tax
		2.5L -  50L		5%
		5.0L  -  100L		20%
		Above 100L		30%
		Note That there is no tax below 2.5L. Take input amount as input from the user.
 * 
 */
import java.util.Scanner;
public class practice_3 {
	public static void main(String[] args) {
		float tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Salary in Lakh : ");
		float income = sc.nextFloat();
		if(income <= 2.5) {
			tax = tax + 0;
		}else if(income > 2.5f && income <= 5f) {
			tax = tax + 0.05f * (income - 2.5f);
		}else if(income > 5f && income <= 10f) {
			tax = tax + 0.05f * (income - 2.5f);
			tax = tax + 0.2f * (income - 2.5f);
		}else if(income > 10.0f) {
			tax = tax + 0.05f * (income - 2.5f);
			tax = tax + 0.2f * (income - 2.5f);
			tax = tax + 0.3f * (income - 2.5f);
		}
		System.out.println("Tax Paid by the employee : "+tax+" Lakh");
	}
}
