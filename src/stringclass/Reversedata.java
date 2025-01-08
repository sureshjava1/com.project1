package stringclass;

public class Reversedata {
	
	public static void main(String[] args)
	{
		String str="welcome to INDIA";
		String revdata="";
		 for(int i=str.length()-1;i>0;i--)// to store the string in reverse and print.
		 {
			 
			 revdata=revdata+str.charAt(i);
			 
				 
		 }
		 
		 System.out.println(revdata);
	}

}
  