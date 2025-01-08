package stringclass;

import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the complete sentence");// "mom and dad went to office"
		String str=sc.nextLine();// to store all words in the sentence
		String array[]=str.split(" ");
		
		for(String sw:array)
		{
			Reversedatareturn s1=new Reversedatareturn();
			s1.reversestring(sw); 
			
			
		}
		
	}
	
		
	

}


