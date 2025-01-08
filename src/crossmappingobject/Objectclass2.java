package crossmappingobject;

public class Objectclass2 {
	
	
	static int x2=200;
	byte b2=20;
	String s2="wellcome to Objectclass2";
	
	
	public static void staticmethod2()
	{
	System.out.println("this is static method from object class2");
	Objectclass2 obj3=new Objectclass2();//creating obj to call non static method from object class1 to object class2
	obj3.nonstaticmethod2();
	Objectclass1 obj4= new Objectclass1();// creating obj to use non static variable(b1) from object class 1 to object class2 in static method.
	System.out.println(obj4.b1);
	obj4.b1=30;// changing the value of non static variable "b" of object class1 in object class2
	System.out.println(obj4.b1);
	System.out.println(Objectclass1.x1);// using class name as reference to use static variable from object class1 to object class2 in static method.
	Objectclass1.x1=500;// changing the value of static variable "b" of object class1 in object class2
	System.out.println(Objectclass1.x1);
	//System.out.println(Objectclass1.staticmethod1();
	
	}
	public void nonstaticmethod2()
	{
		System.out.println("this is nonstatic method from object class2");
		System.out.println(x2);
		System.out.println(b2);
		System.out.println(s2);
		
	    Objectclass1 obj5= new Objectclass1();// creating obj to use non static variable(b1) from object class 1 to object class2 in non static method.
		System.out.println(obj5.s1);
		obj5.nonstaticmethod1();//using obj to call  non static method from object class1 to object class 2
		System.out.println(Objectclass1.x1);// using class name as reference to use static variable from object class1 to object class2 in non static method.
		
	}
	public static void main(String[] args) {
		staticmethod2();
		
	
		
		

}
	
}
	
	
	


