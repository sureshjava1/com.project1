package Inherit01;

// this is having single level inheritance, inherit01class1-->inherit011class2.

public class Inherit1class2 extends Inherit1class1 {
	 
	
    void hitech1()              // non static method 
    {
    	System.out.println(a);
    	System.out.println(b);// we can call non static variable from class 1 as we are calling in non static method with parent child relation.
    	hi1();// we can call non static method from class 1 as we are calling in non static method with parent child relation.
    	hello1();
    	System.out.println("This is non static method-hitech, from Inherit1class2");
    }
	
	public static void main(String[] args)
	{
		System.out.println(a);// we are able to call static variable "a" from other class due to parent child relation
		Inherit1class2 obj=new Inherit1class2();
		System.out.println(obj.b);// we are calling not static variable "b" from class1 with obj created for current class2 ,as it had parent child relation.
		
		hello1();// calling static method directly from parent class with any class reference.
		obj.hi1();// we are calling not static method "hi" from class1 with obj created for current class2 ,as it had parent child relation.
		
		
		obj.hitech1();// calling non static method "hitech" from same class2 by using obj reference of class2
	}
 
}
