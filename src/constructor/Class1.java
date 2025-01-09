package constructor;

import constructor.Class1;

public class Class1 {

	int a;
	int b;
	public int c=1000;
	boolean bool;
	// this is a constructor with class name
	Class1()// Constructor with no input parameter
	{
		a=500;
	}
	
	
	Class1(int x)// Constructor with input 

{
	 a =x;
	 System.out.println("This is constructor");
}
	
	Class1(int x, boolean y)// Constructor with input parameter

	{
		 a =x;
		 bool=y;
	}
		
	
	public static void main(String[]args)
	{
		
		Class1 obj=new Class1(20);
		System.out.println(obj.a);
		Class1 obj1=new Class1();
		System.out.println(obj1.a);
		Class1 obj2=new Class1(100,true);
		System.out.println(obj2.a);
		System.out.println(obj2.bool);
		}
	
	
	
}
