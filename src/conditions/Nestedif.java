package conditions;

import java.util.Scanner;

public class Nestedif {
	
	public static int cu;//current bill
	public static int pu;//previous bill
	public static String name;
	public static String area;
	public static String usage;
	
	/* generate electricity bill with unit rate and identify the meter reading based on current bill and previous bill,
	 * conditions -->based on area:rural/town/city . Inside each area we have home/commerical/industrial  usage slot
	 * and we need to decide unit price based on usage limit (<250, 100 to 249, 250 to 749 and above 750)also we need to add base charge or every bill.
	 */
	
	public static void electbill()
	{
		
		int units=cu-pu;
		int amount = 0;
		int bc=150;//base charge
		if(area.equalsIgnoreCase("rural"))// we cannot use "==" to compare strings, hence we use "equalsIgnoreCase" string method.
			if(usage.equalsIgnoreCase("home"))
		if(units<100)
		{
			amount=units*1;
		}
		else if(units<250&units>=100)
		{
			amount=units*2;
		}
		else if(units<750&units>=250)
		{
			amount=units*3;
		}
		else if(units>=750)
		{
			amount=units*4;
		}
		if(usage.equalsIgnoreCase("commerical"))
			if(units<100)
			{
				amount=units*2;
			}
			else if(units<250&units>=100)
			{
				amount=units*3;
			}
			else if(units<750&units>=250)
			{
				amount=units*4;
			}
			else if(units>=750)
			{
				amount=units*5;
			}
		if(usage.equalsIgnoreCase("industry"))
			if(units<100)
			{
				amount=units*3;
			}
			else if(units<250&units>=100)
			{
				amount=units*4;
			}
			else if(units<750&units>=250)
			{
				amount=units*5;
			}
			else if(units>=750)
			{
				amount=units*6;
			}
		if(area.equalsIgnoreCase("town"))
			if(usage.equalsIgnoreCase("home"))
		if(units<100)
		{
			amount=units*2;
		}
		else if(units<250&units>=100)
		{
			amount=units*3;
		}
		else if(units<750&units>=250)
		{
			amount=units*4;
		}
		else if(units>=750)
		{
			amount=units*5;
		}
		if(usage.equalsIgnoreCase("commerical"))
			if(units<100)
			{
				amount=units*3;
			}
			else if(units<250&units>=100)
			{
				amount=units*4;
			}
			else if(units<750&units>=250)
			{
				amount=units*5;
			}
			else if(units>=750)
			{
				amount=units*6;
			}
		if(usage.equalsIgnoreCase("industry"))
			if(units<100)
			{
				amount=units*4;
			}
			else if(units<250&units>=100)
			{
				amount=units*5;
			}
			else if(units<750&units>=250)
			{
				amount=units*6;
			}
			else if(units>=750)
			{
				amount=units*7;
			}
		if(area.equalsIgnoreCase("city"))
			if(usage.equalsIgnoreCase("home"))
		if(units<100)
		{
			amount=units*4;
		}
		else if(units<250&units>=100)
		{
			amount=units*5;
		}
		else if(units<750&units>=250)
		{
			amount=units*6;
		}
		else if(units>=750)
		{
			amount=units*7;
		}
		if(usage.equalsIgnoreCase("commerical"))
			if(units<100)
			{
				amount=units*5;
			}
			else if(units<250&units>=100)
			{
				amount=units*6;
			}
			else if(units<750&units>=250)
			{
				amount=units*7;
			}
			else if(units>=750)
			{
				amount=units*8;
			}
		if(usage.equalsIgnoreCase("industry"))
			if(units<100)
			{
				amount=units*6;
			}
			else if(units<250&units>=100)
			{
				amount=units*7;
			}
			else if(units<750&units>=250)
			{
				amount=units*8;
			}
			else if(units>=750)
			{
				amount=units*9;
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
		System.out.println("identify area and enter rural/town/city:");
		area=obj.next();
		System.out.println("identify usage type and enter home/commerical/industry:");
		usage=obj.next();
		electbill();
	}

}
