package calculator;

public class Calculatorlogicclass {
	
	static int z= 10;//global variable
	  String s="welcome to calculator logic";// Instance variable
	
	public void add(int x, int y)
	{
		int a =x;
		int b =y;
		System.out.println(a+b);
	}
	
	public static void  sub(int x, int y)
	{
		int a =x;
		int b =y;

		System.out.println(a-b);
	}
	
	public void mul(int x)
	{
		int a =x;
		int b =20;// local variable
		System.out.println(a*b);
	}
		
		public void div(int x, int y)
		{
			int a =x;
			int b =y;
			System.out.println(a/b);

}
		
	
		
		
}