package operators;

//Logical operators A&B,A|B,A!, B!

public class Logicaloperator {
	
		public  boolean and(int x,int y)
		 { 
			Codelogic o=new Codelogic();
			return(o.notequalto(x,y) & o.equalto(x,y));
		 }
		
	
	   public  boolean or(int x,int y)
	 { 
		Codelogic o=new Codelogic();
		return(o.greaterthan(x,y) | o.lessthan(x,y));
	 }
	
	   public  boolean reverseoperator(int x,int y)
	 { 
		Codelogic o=new Codelogic();
		return(!o.equalto(x,y));
	 }
	
	   //Incremental operators pre-increment: ++v, Post incremental: v++, pre-decremental:--v, post decremental:v--
	   
	   public void incremental()
	   
	   {
		  int i=10;
		  System.out.println("the results for line i++ is :"+ i++);
		  System.out.println(i);
		  System.out.println("the results for line ++i is :"+ ++i);
		  System.out.println(i);
	   }
	   
public void decremental()
	   
	   {
		  int i=12;
		  System.out.println("the results for line i-- is :"+ i--);
		  System.out.println(i);
		  System.out.println("the results for line --i is :"+ --i);
		  System.out.println(i);
	   }

//Assignment operators =, +=, -=, /+, %=, &=, |=, */

public void assig()
{
	int a=100;
	a+=10;
	System.out.println(a);
	a-=20;
	System.out.println(a);
	a*=5;
	System.out.println(a);
	a/=10;
	System.out.println(a);
	a%=5;
	System.out.println(a);
	
}
	public static void boolassign()
	{
		boolean b=false;
		b&=true;
			System.out.println(b);
		b|=true;
		System.out.println(b);
		
	}
}
