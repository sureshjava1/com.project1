package com.p1;

import java.util.Scanner; // import the Scanner class

public class Class1 {
	
	
	  

	public static void hello() 
	{
		System.out.println("Start 2nd innings");
		System.out.println("Keep conidence and patiance");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	
	    String x;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    x = myObj.nextLine();   
	       
	    System.out.println("Username is: " + x); 
	    hello();

	}

}
