package Java;

public class Associativity_of_operator {
	public static void main(String[] args) {

		int x = 6;
		int y = 1;
		int k = x*y/2;
		System.out.println("K Value : "+k);
		
		int b = 1;
		int c = 4;
		int a = 5;
		int j = b*b - 4*a*c/2*a;
		int l = b*b - (4*a*c)/(2*a);
		System.out.println("J Value : "+j);
		System.out.println("l Value : "+l);
	
	}		
}
