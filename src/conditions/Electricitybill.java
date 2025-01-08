package conditions;

import java.util.Scanner;

public class Electricitybill {
	
	static int cu;//current bill
	static int pu;//previous bill
	static String name;
	
	/* generate electricity bill and identify the meter reading based on current bill and previous bill, need to decide unit price based on usage limit (<250, 100 to 249, 250 to 749 and above 750)also we need to add base charge or every bill.
	 */
	public static void bill()
	{
		
		int units=cu-pu;
		int amount = 0;
		int bc=150;//base charge
		
		if(units<100)
		{
			amount=units*2;
		}
		else if(units<250&units>=100)
		{
			amount=units*4;
		}
		else if(units<750&units>=250)
		{
			amount=units*8;
		}
		else if(units>=750)
		{
			amount=units*10;
		}
		
		System.out.println("Total amount "+name+" need to pay "+(amount+bc));
		
	}

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the customer name:");
		name=obj.next();
		System.out.println("enter current reading:");
		cu=obj.nextInt();
		System.out.println("enter previous reading:");
		pu=obj.nextInt();
		bill();
				
	}
}
