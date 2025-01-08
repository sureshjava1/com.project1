package constructor;

public class Class2 {
	
	int y=250;
	
	Class2()
	{
		Class1 obj=new Class1();
		int x=obj.c;// using the public variable "c" from class1 inside the constructor
		System.out.println(x);
	}

	public static void main(String[] args)
	{
		Class2 obj5=new Class2();
		System.out.println(obj5.y);
		
	}
}
