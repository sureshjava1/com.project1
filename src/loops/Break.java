package loops;


public class Break
{
	public static void brk()
	{
		for(int i=1;i<=50;i++)
		{
			
			if(i==21)
				break;// it breaks the execution and comes out of loop
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args)
	{
		Break.brk();
	}
}
