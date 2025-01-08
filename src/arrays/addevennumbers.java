package arrays;

import java.util.Scanner;

public class addevennumbers {

	/* This array will load all the values into array in the given range of numbers and retrieve the data from the array
	 * this array will identify the count of add and even numbers in the given range
	 * create new arrays and store the even and add numbers in the arrays separately
	 * retrieve the data from both the arrays */
	
	

	 static void numbers(int fromrange, int torange)
	{
	// storing the array with range of data .
		int range=(torange-fromrange)+1;
		int array1[]=new int[range]; 
		for(int i=0;i<array1.length;i++) 
		{
			array1[i]=fromrange++;
			
		}
		//retrieving the data from array1 and displaying
	     for(int n:array1)// for each loop used for arrays/collections to retrieve the data
	     {
	    	 System.out.println(n); 
	     }
	
		// Identifying the count of add and even numbers in the array

			int evennum =0;
			int addnum=0;
		for(int n:array1)// for each loop used for arrays/collections to retrieve the data
		{
			if(n%2==0)
			{
				evennum++;
			}
			else
			{
				addnum++;
			}
		}
			System.out.println("even count: "+evennum+"  ,add count:"+addnum);	
		
			
			//create new arrays and store the even and add numbers in the arrays separately from above range
			
		    int array2[] =new int[evennum];
		    int array3[] =new int[addnum];
		    int ecount=0;
		    int acount=0;
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]%2==0)
			{
				array2[ecount++]=array1[i];
			}
		    	else
			{
				array3[acount++]=array1[i];
			}
		    
		    }
		    //use for each loop and retrieve the data from array2 and array3 (add and even numbers)
		   for(int n1:array2)
		    {
		    	System.out.println("data from even numbers array2: "+n1);
		    }
		    
		    for(int n2:array3)
		    {
		    	System.out.println("data from add numbers array3: "+n2);
		    }
		    
		    
			
	}
	 
	
	
	
 public static void main(String[] args) 
       
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number from range to start");
	int fromrange=sc.nextInt();
	System.out.println("enter the number until range to stop");
	int torange=sc.nextInt();
	numbers(fromrange, torange);
	
	
	
      
	
}

}
