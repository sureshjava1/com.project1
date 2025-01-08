package stringclass;

import java.util.Scanner;

public class Uppertolowertouppercase {
	
	
	static void cases(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
		 
		if(Character.isUpperCase(s.charAt(i)))
		{
			
				char l=Character.toLowerCase(s.charAt(i));
				System.out.print(l);
				
		}
		else
		{
			    char u=Character.toUpperCase(s.charAt(i));
			    System.out.print(u);
		}
		}
		
		}
	 static void uppercase(String s)// changing the whole sentence to upper case
	 {
		 System.out.print(s.toUpperCase()+" ");
	 }
     
	 static void lowercase(String s) // changing the whole sentence to lower case
	 {
		 System.out.print(s.toLowerCase()+" ");
	 }

	
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text to change upper to lower to upper case");//UppEr casE to LOWer CASe To uppER CAse
		String str=sc.nextLine();// stores complete input sentence
		String word[]=str.split(" ");// splits the input sentence to words by " " delimiter.
		for(String s:word)
		{
		cases(s);
		System.out.print(" ");// it helps to print space between each word in the output
		}
		System.out.println(" ");// it helps to print the output of upper case and lower case in separate lines
		for(String s:word)
		{
		uppercase(s);
		}
		System.out.println(" ");// it helps to print the output of upper case and lower case in separate lines
		for(String s:word)
		{
		lowercase(s);
		}
	}
}
