package com.p1;

import java.util.Scanner;

public class Sample {
	
	
	
		
			
			
	public static void main(String[] args)   
	{  
	int number = 12, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	
	
}
