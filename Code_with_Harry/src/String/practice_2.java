package String;
//2.	Write a java program to replace spaces with underscores.package String;

public class practice_2 {
	public static void main(String[] args) {
		String name = "Ram Hari";
		System.out.println("Original : "+name);
		name = name.replace(" ","_");
		System.out.println("Replace : "+name);
	}
}
