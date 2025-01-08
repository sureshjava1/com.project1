package abstraction;

import java.util.Scanner;

public class User {
	
	static Country c; // Country is a abstract class we use "c" as reference for country
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country name");
		String name=sc.next();
		if(name.equals("India"))
		{
			c=new India();// creating an object for India , to access any methods
		}
		else if(name.equals("Rus"))
		{
			c=new Rus();// creating an object for Russia , to access any methods
		}
		else if(name.equals("USA"))
		{
			c=new USA();// // creating an object for USA , to access any methods
		}
		else if(name.equals("Aus"))
		{
			c=new Aus();// creating an object for Australia, to access any methods
		}
		else 
		{
			System.out.println("This country is not in travel list");
		}
		c.currency();// this is abstract method
		c.mountains();// calling non abstract method.
	}

}
