package String;
/*
3.	Write a java program to fill in a letter template which bots like below :
		Letter  = “ Dear  <| Name |> , Thanks a lot “
		Replace <| Name |> with a String ( Some name )
*/

public class practice_3 {
	public static void main(String[] args) {
		String letter = "Dear <|name|>, Thanks a lot !!";
		letter.replace("<|name|>","Sushant");
		System.out.println(letter);
		
		System.out.println("-----------------------");
		String letter1 = "Dear <|name|>, Thanks a lot !!";
		letter1=letter1.replace("<|name|>","Sushant");
		System.out.println(letter1);
	}
}
