package stringclass;

import java.util.Scanner;

public class Duplicatecharacterwithlogic {
	
	
	static void duplicatechar(String s)
	{
		//char ch=s.charAt(0);
		
	   for(int i=0;i<s.length();i++)
	   {
		  char ch=s.charAt(i);
		  ++i;
		 char cha=s.charAt(i);
		   if(ch==cha)
		   {
			   System.out.println(ch+"  is duplicate character");
		   }
	   }
	
}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the complete sentence");// ""
		String str=sc.nextLine();// to store all words in the sentence we use "nextline" string method
		 String word[]=str.split(" ");
		for(String s:word)
		{
		duplicatechar(s);
		}
	}

}
