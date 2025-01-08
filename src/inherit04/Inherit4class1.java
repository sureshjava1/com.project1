package inherit04;

public class Inherit4class1 {
	
	public static int m=100; // can be accessed with in the project due to public access modifier
	static  protected int n=50;// can be accessed with in the package and only children present out the package with in project due to protected access modifier
	String s="welcome to hybrid inheritance";
	void hi4class1()
	{
		System.out.println("This is non static method-hi, from Inherit4class1" );
	}
	
	static void hello4class1()
	{
		System.out.println("This is static method-hello, from Inherit4class1" );
	}

}
