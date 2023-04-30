package Chapter_6_methods;

public class call_method {
	static int logic(int x, int y) {
		int z;
			if(x>y) {
				 z = x+y;
			}else {
				 z = (x+y)*5;
			}
		return z;
			
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c;
//		call_method obj = new call_method();
		c = logic(a,b);
		
		int a1 = 4;
		int b1 = 15;
		int c1;
		c1 = logic(a1,b1);
		
		System.out.println("C : "+c);
		System.out.println("C1 : "+c1);
	}
}
