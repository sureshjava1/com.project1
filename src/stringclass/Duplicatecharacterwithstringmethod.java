package stringclass;

import java.util.Scanner;

public class Duplicatecharacterwithstringmethod {
	
	static void duplicatechar(String s)// Identifying the duplicate characters in each word of given sentence.
	{
         
			for(int i=0;i<s.length();i++)
			{
			char ch =s.charAt(i);
		    int findex=s.indexOf(ch);
		    int lindex=s.lastIndexOf(ch); 
		    
		    if(findex==lindex) 
		    {
		    	System.out.println(ch+" There is no duplicate character in the word");
		    }
		    else
		    {
		    	System.out.println(ch+" There is a duplicate character in the word");
		    }
		}
		
			
			
		 
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the complete sentence");// "Welcome to Quality thought welcome Students"
		String str=sc.nextLine();// to store all words in the sentence we use "nextline" string method
		 String word[]=str.split(" ");
		for(String s:word)
		{
		duplicatechar(s);
		}
		
		
		
		
	}
}
