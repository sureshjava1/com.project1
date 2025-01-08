package stringclass;

import java.util.Scanner;

public class Charactercount {

	
	static void ccount(String s)
	{
		int dig=0;
		int spl=0;
		int alpa=0;
		
		
		for(int i = 0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				alpa++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				dig++;
			}
			else
			{
				spl++;
			}
		}
			System.out.println("no of alphabets: "+alpa+" no of digits present: "+dig+" no of special charcters present: "+spl);
			int sum=alpa+dig+spl;
			
		if(sum==s.length())
		{
			System.out.println("Data matched");
		}
		else
		{
			System.out.println("check the logic");
		}
			
		}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text with numbers,special charcters and alphabets");//welcome 2 J@v@ 99 @ quality thought.
		String str=sc.nextLine();// we don't store the string into words in array ,boz we need count for whole sentence at a time.
		ccount(str);
		

	}

}
