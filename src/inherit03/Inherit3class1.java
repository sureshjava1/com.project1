package inherit03;

public class Inherit3class1 {

	public static int x=100; // can be accessed with in the project due to public access modifier
	protected int y=50;// can be accessed with in the package and only children present out the package with in project due to protected access modifier
	
	void hi1()
	{
		System.out.println("This is non static method-hi, from Inherit3class1" );
	}
	
	static void hello1()
	{
		System.out.println("This is static method-hello, from Inherit3class1" );
	}
}
