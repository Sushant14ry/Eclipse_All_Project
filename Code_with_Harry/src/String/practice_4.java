package String;
/*
 * 4.	Write a java program to detect double and triple spaces in a String.
 * 
 */
public class practice_4 {
	public static void main(String[] args) {
		String name = "hello  Sushant   Chaudhary";
		System.out.println("Double Space : "+name.indexOf("  "));
		System.out.println("Triple Space : "+name.indexOf("   "));
	}
}
