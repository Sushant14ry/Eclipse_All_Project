package Chapter_6_methods;

public class Var_arguments {
	static int sum(int x, int...arr) {
		int result =x;
		for(int a: arr) {
			result +=a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to VarArgs");
		System.out.println("Sum of 1 : "+sum(5));
		System.out.println("Sum of 5 and 6 : "+sum(5,6));
		System.out.println("Sum of 5,6 and 8 : "+sum(5,6,8));
		System.out.println("Sum of 4,5,6 and 8 : "+sum(4,5,6,8));
	}
}
