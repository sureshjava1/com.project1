package operators;

public class Codelogic {
	
	
	
	//Assignment operators +,-,*, /, %
	
	public void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x, int y)
	{
		System.out.println(x-y);
	}
	public static void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	public void div(int z,int x)
	{
		System.out.println(z/x);
	}
	public void rem(int y,int x)
	{
		System.out.println(y%x);
	}
	
	// Comparator operators <,>,<=,>=,==, !=
	public boolean greaterthan(int x,int y)
	{
		return x>y;
	}
	
	public boolean lessthan(int x,int y)
	{
		return x<y;
	}
	public boolean greaterthanequal(int x,int y)
	{
		return x>=y;
	}
	public boolean lessthanequal(int x,int y)
	{
		return x<=y;
	}
	public boolean equalto(int x,int y)
	{
		return x==y;
	}
	public boolean notequalto(int x,int y)
	{
		return x!=y;
	}
}
