package arrays;

import java.util.Random;

public class TwoDarray {
	
	public static void main(String[] args)
	{
	
	int array[][]=new int[20][20];
	Random r=new Random();
	
	
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array[1].length;j++)
		{
			array[i][j]=r.nextInt(100);//storing the random numbers and  we are giving 10 value for specific size to print
		}
	
	}
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array[1].length;j++)
		{
			System.out.print(array[i][j]+"\t");// we are printing the data and also we are using  +'\t" for tabular form to print
		}
		System.out.println();
	   }
	  
	 }
	}
