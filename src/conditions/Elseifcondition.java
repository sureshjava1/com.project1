package conditions;

public class Elseifcondition {
	
	static int math;
	static int soc;
	static int phy;
	
	/* printing the total marks of the three subjects and the marks of each subject
	 *  ,if marks or each subject is >35 is pass/fail of each subject */
	 
	
	static void results()
	{
		Boolean status =true;
		int total=(math+soc+phy);
		
		if (math<35)
		{
			status=false;
			System.out.println("You have Failed Maths subject:"+math);
			
		}
		else
		{
			System.out.println("You have passed Maths subject: "+math);
		}
		if(soc<35)
		{
			status=false;
			System.out.println("You have Failed Social subject: "+soc);
		}
		else
		{
			System.out.println("You have passed Social subject: "+soc);
		}
		if (phy<35)
		{
			status=false;
			System.out.println("You have Failed Physics subject: "+phy);
		}
		else
		{
			System.out.println("You have  passed Physics subject: "+phy);
		}
		if(status)
		{  
			System.out.println("You had passed all subjects with total: "+total+" Marks");
		}
		else
		{
			System.out.println("You had Failed one or more subjects with total:  "+total+" Marks");
		}
		/*if((math<35)|(soc<35))
		
		{
			System.out.println("You had Failed one or more subjects with total:  "+total+" Marks");
		}
		else if(phy>=35)
			
		{
		  System.out.println("You had passed all subjects with total: "+total+" Marks");
		}
		else
		{
			System.out.println("You had Failed one or more subjects with total:  "+total+" Marks");
		}*/
	}
		
	

}
