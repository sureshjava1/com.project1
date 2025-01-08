package loops;



public class Continue {
	
	public static void con()
	{
		for(int i=1;i<=25;i++)
		{
			if(i==21)
				continue;// it skip rest of the lines of the code present in the block for this iteration and again starts checking for loop condition.
			
			System.out.println(i);
			
			
		}
	}

	public static void main(String[] args) {
		
Continue.con();
	}


}
