package com.p1;

// Static// Non Static// Object// Types of Variables.
/*memory is allocated for static variable, where object is used as reference for instance variable for
memory allocation*/

public class Class6 {
	
	static int a=100;     // Global variable
	static float b= 200f;  // Global variable
	char c= '@';          // Instance variable
	String d= "Suresh";   // Instance variable
	boolean e= true;      // Instance variable
	byte f=110;            // Instance variable
	short g=11111;         // Instance variable
	double h=10.5;         // Instance variable
	public static void main(String[] args) {
		
		Class6 obj1= new Class6();
		System.out.println(obj1.e);
		System.out.println(obj1.g);
		System.out.println(obj1.f);
		System.out.println(a);
		staticmethod1();// calling static sub method into main
		
		b=300;       // Local variable
		System.out.println(b);
	
	}
	
	public static void staticmethod1() {
		boolean f=false;  // Local variable
		char z=66;       // Local variable
		System.out.println(b);
		System.out.println(f);
		Class6 obj2= new Class6();
		System.out.println(obj2.c);
		System.out.println(obj2.f);
		System.out.println(z);
		obj2.nonstaticmethod2();// calling non static method to static sub method
		
		
		
	}
	
public  void nonstaticmethod2() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(h);
	}

}
