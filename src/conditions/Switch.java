package conditions;

import java.util.Scanner;

public class Switch {
	
	static void months(int month)
	{
	
		
		switch(month)
		{
		case 1:
		{
			System.out.println("Jan");
			break;
		}
		
		case 2:
		{
			System.out.println("Feb");
			break;
		}
		case 3:
		{
			System.out.println("March");
			break;
		}
		case 4:
		{
			System.out.println("April");
			break;
		}
		case 5:
		{
			System.out.println("May");
			break;
		}
		case 6:
		{
			System.out.println("June");
			break;
		}
		case 7:
		{
			System.out.println("Jully");
			break;
		}
		case 8:
		{
			System.out.println("Aug");
			break;
		}
		case 9:
		{
			System.out.println("Sep");
			break;
		}
		case 10:
		{
			System.out.println("Oct");
			break;
		}
		case 11:
		{
			System.out.println("Nov");
			break;
		}
		case 12:
		{
			System.out.println("Dec-Happy Christmas!");
			break;
		}
		default:
			
			System.out.println("Please enter the value from range 1 to 12, ater running the program again");
		}
	}
	
		public static void main(String[] args)
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("enter the no of month in year:");
			int month=obj.nextInt();
			months(month);
			
					
		}
	
	

}
