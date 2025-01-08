package loops;

import java.util.Scanner;

import conditions.Nestedif;// calling "Nestedif" class from different package "conditions" to another package and class.

public class Executionloops {

	public static void main(String[] args)
	
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the customer name:");
		Nestedif.name=obj.next();
		System.out.println("enter previous reading:");
		Nestedif.pu=obj.nextInt();
		System.out.println("enter current reading:");
		Nestedif.cu=obj.nextInt();
		
		while(Nestedif.cu<Nestedif.pu)// while loop will enter only if condition is satisfied.
		{
			System.out.println("Note:current reading should be greater than previous reading");
			Nestedif.cu=obj.nextInt();
		}
		System.out.println("identify area and enter rural/town/city:");
		Nestedif.area=obj.next();
		System.out.println("identify usage type and enter home/commerical/industry:");
		Nestedif.usage=obj.next();
		Nestedif.electbill();

	}

}
