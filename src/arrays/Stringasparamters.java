package arrays;

public class Stringasparamters {
	
	
	public static void printstring(String names[])
	{
		for(String s:names)
		{
			System.out.println(s);
		}
	
	}
	
	public static String[] updatestring(String names[])
	{
		for(int i=0;i<names.length;i++)
		{
			names[i]="QT "+names[i]; 
		
		}
		return names;
	}
	
	public static void main(String[] args)
	{
	String names[] =new String[4];
	names[0]="hello";
	names[1]="welcome";
	names[2]="to";
	names[3]="java";
	
	printstring(names);
	updatestring(names);
	for(String sr:names)
	{
	
		System.out.println(sr);
	}
	}
}
