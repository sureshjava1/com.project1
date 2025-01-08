package crossmappingobject;

public class Objectclass1 {
	
	static int x1=100;
	byte b1=10;
	String s1="wellcome to Objectclass1";
	
	public static void staticmethod1()
	{
	System.out.println("this is static method from object class1");
	Objectclass1 obj1=new Objectclass1();
	
	obj1.nonstaticmethod1();// using obj to call non static method in same class
	
	System.out.println(Objectclass2.x2); // using class name as reference to use static variable from object class2 to object class1 in static method.
	
	 Objectclass2 obj2= new Objectclass2();// creating obj to use non static variable from object class 2 to object class1 in static method.
		System.out.println(obj2.s2);
	
	  obj2.nonstaticmethod2();//using obj to call  non static method to static method from object class2 to object class 1.
		
	  Objectclass2.staticmethod2();// calling static method from object class2 to static method in object class1 with class name as reference.
		
	}
	public void nonstaticmethod1()
	{
		System.out.println("this is nonstatic method from object class1");
		System.out.println(x1);
		System.out.println(b1);
		System.out.println(s1);
		
		
			
		
	}
	public static void main(String[] args) {
		staticmethod1();
		
		

}
	
}