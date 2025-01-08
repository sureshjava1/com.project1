package stringclass;

import java.util.Scanner;

public class Stringexecution {
	
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the word to check");
		String str=s.next();
		
		Reversedatareturn r=new Reversedatareturn();
		r.reversestring(str);// it reverse the string and check palindrome
		;
		
	}

}
 