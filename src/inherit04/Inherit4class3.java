package inherit04;

//public class Inherit4class3 extends 

public class Inherit4class3 extends Inherit4class1 
{
	
	
	static void ok()
	{
		System.out.println(m);
    	System.out.println(n);
    	System.out.println(s);// we can call non static variable from class 1 as we are calling in non static method with parent child relation.
    	hi4class2();// we can call non static method from class 2, as we are calling in non static method with parent child relation.
    	hello4class2();
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println(m);// we are able to call static variable "m" from other class due to parent child relation
		System.out.println(n);//we are calling static variable "n" which is protected with access modifier  from class1 with obj created for current class3 ,as it had parent child relation.
		
		Inherit4class1 obj1=new Inherit4class1();
		System.out.println(obj1.s);// // we are able to call non static variable "s" from other class due to parent child relation
		hello4class1();// calling static method directly from parent class with any class reference.
		obj1.hi4class1();// we are calling not static method  from class1 with obj created for current class3 ,as it had parent child relation.
		
		
		
	}

}
