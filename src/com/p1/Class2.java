package com.p1;

import crossmappingobject.Objectclass2;

public class Class2 {
 static int y=100;//global variable
  int z=20; //instance variable
 

public static void staticmethod() {
	Class2 ob = new Class2();
	//ob.nonstatic();
	System.out.println(ob.z);
	
}

public static void main(String[] args) {
	System.out.println(y);
staticmethod();	
Class2 ob3 = new Class2();
ob3.nonstatic();
Objectclass2.staticmethod2();

}

public void nonstatic() {
	 int x=10;//local variable
	 
	System.out.println("this is nonstatic method");
	System.out.println(x);
	System.out.println(z);
	System.out.println(y);
}
		

}