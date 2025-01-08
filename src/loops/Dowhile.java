package loops;

import java.util.Scanner;

import conditions.Nestedif;// calling "Nestedif" class from different package "conditions" to another package and class.

public class Dowhile {


		
		public static void main(String[] args)
		
		{
			Scanner obj=new Scanner(System.in);
			
			
			
			System.out.println("enter the customer name:");
			Nestedif.name=obj.next();
			System.out.println("enter previous reading:");
			Nestedif.pu=obj.nextInt();
			//System.out.println("enter current reading:");
			//Nestedif.cu=obj.nextInt();
			
			do
			{
				System.out.println("Note:current reading should be greater than previous reading");
				Nestedif.cu=obj.nextInt();
			}
			while (Nestedif.cu<Nestedif.pu);/*"do while" loop will execute  the block of code at least ones(mandatory) 
			and based on condition it will re execute multiple times until condition is satisfied*/
			
				
			
			System.out.println("identify area and enter rural/town/city:");
			Nestedif.area=obj.next();
			System.out.println("identify usage type and enter home/commerical/industry:");
			Nestedif.usage=obj.next();
			Nestedif.electbill();
			}
		
		
	}


