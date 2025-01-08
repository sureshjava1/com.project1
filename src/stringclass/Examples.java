package stringclass;

public class Examples {
	
	public static void main(String[] args)
	{
		String str="welcome to INDIA";
		
		for(int i=0;i<str.length();i++)
		System.out.println(str.charAt(i));// to print the string in horizontal  line.
		
		// to covert from  string to array
			char array[]= str.toCharArray();
		 for (char a:array)
			System.out.println(a);
		 
		// to print the string in reverse order
		 
		  for(int i=str.length()-1;i>=0;i--)
			  
		 System.out.print(str.charAt(i));
	}

}
