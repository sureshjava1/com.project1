package loops;

public class Simpleforloop {
	
	public static int table;
	public static int p;
//to print total count of even and add numbers present in the range given. by using simple for loop and also which number is even and add
	
	public static void sfloop()
	
	{
		int even=0;
		int add=0;
		
		
		for(int i=1;i<=1000;i++)
		{
			if(i%2==0)
		{
			even++;
			System.out.println("even numbers: "+ i);
		}
		else
		{

			add++;
			System.out.println("add numbers: "+i);
		}
		}
		System.out.println("no of even numbers "+even++ +" no add numbers:"+add++);
	}
	
	//printing math tables by giving the table number
	public static  void tables()
	{
		
		for(int i=1;i<=10;i++)
		{
			int t=table*i;
			System.out.println(table+"*"+i+"="+t);
		}
	}
	
	// verify the given number is prime number or not.
	
	public static void prime()
	{
		boolean status=true;
		for(int i=2; i<p;i++)
			if(p%i==0)
			{
				status=false;
				
			}
			if(status==true)
			{
				System.out.println("it is  prime number");
			}
			else
			{
				System.out.println("it is not prime number");
			}
			
		
	}

}
