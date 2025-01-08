package overloading;

public class Class2 {
	
	
	
	public static void main(String[] args)
	{
		Class1 o=new Class1();
		o.overload(20,30,40);// this is calling the second method "overload" in class1 based on input parameters.
		o.overload(20,30);// this is calling the first method "overload" in class1 based on input parameters.
	}

}
