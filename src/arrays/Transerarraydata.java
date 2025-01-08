package arrays;

import java.lang.reflect.Array;

public class Transerarraydata {
	
	
	public static void main(String[] args)
	{
		
		int array1[] =new int[100]; 
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=i+1;
		}
	
	
	int array2[] =new int[array1.length];// creating new array2 to transfer data from array1
	for(int i=0;i<array1.length;i++)
	{
		array2[i]=array1[i];
	}
	
	for(int n:array2)//Retrieving the array2
	{
		System.out.println(n);
	}
	
	for(int i=0;i<array1.length;i++)// adding two integer arrays with same data type and same size.
	{
		System.out.println(array1[i]+array2[i]);
	}
	int d=99;
	for(int i=0;i<array1.length;i++)// adding two integer arrays with same data type and same size in reverse.
	{
		System.out.println(array1[i]+array2[d--]);
	}
	}
	
	

}
