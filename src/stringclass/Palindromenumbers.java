package stringclass;

import java.util.Scanner;

public class Palindromenumbers {
	
	// create a program to identify the palindrome numbers between the given range of number.
	
	static  void reversenumbers(int fromrange, int torange)// creating method to reverse numbers
		{
		int range=(torange-fromrange)+1;
		int array1[]=new int[range]; 
		 
		
		for(int i=0;i<array1.length;i++) 
		{
			array1[i]=fromrange++;
		}
			for (int num:array1)
			{
				int x=num;
				int reverse = 0;
			while(num != 0)   
			{  
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
			 }  
			//System.out.println("The reverse of the given number is: " + reverse);
			checkpalindrome(x,reverse);
			}  
			
		}
		
		
		 static void checkpalindrome(int x, int reverse)// creating method to verify number is  palindrome
		 {
			 if(x==reverse)
				{
					System.out.println(x+" is Palindrome");
				}
				
		 }
		 
		
		 
		 public static void main(String[] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter the number from range to start");
				int fromrange=sc.nextInt();
				System.out.println("enter the number until range to stop");
				int torange=sc.nextInt();
				
				reversenumbers(fromrange,torange);
			
		 }


}
