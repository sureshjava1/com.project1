package conditions;

import java.util.Scanner;

import loops.Simpleforloop;

public class Execution {
	

	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Ifcondition.num=sc.nextInt();
        Ifcondition.addevennumbers();// calling "addevennumbers" method from class "Ifcondition"
        
        System.out.println("Enter the marks obtained in Maths");
        Elseifcondition.math=sc.nextInt();
        System.out.println("Enter the marks obtained in Social");
        Elseifcondition.soc=sc.nextInt();
        System.out.println("Enter the marks obtained in Physics");
        Elseifcondition.phy=sc.nextInt();
        Elseifcondition.results();//calling "results" method from "Elseifcondition" class.
        
        Simpleforloop.sfloop();// calling "sfloop" method from "Simpleforloop" class 
        System.out.println("Enter the table number you want to print ");
        Simpleforloop.table=sc.nextInt();
        Simpleforloop.tables();
        
        System.out.println("Enter the number to verify prime number ");
        Simpleforloop.p=sc.nextInt();
        Simpleforloop.prime();
		
		
	}
}
