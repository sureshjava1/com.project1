package classesfromlibrary;

import java.util.Scanner;

public class Scanner1 {
	
	 static void marks()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the marks");
			int a=sc.nextInt();
			boolean b=(a>500);
			if(b)
			{
				System.out.println("Congrajulations ,you achived the target");
			}
			else
			{
				System.out.println("Sorry ,you have not  achived the target");
			}
		
		}
		public static void main(String[]  args)
		{
			
			marks();
		}


}
