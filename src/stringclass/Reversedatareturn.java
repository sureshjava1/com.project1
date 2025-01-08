package stringclass;

public class Reversedatareturn {
	
	 String reversestring(String str)// creating method to reverse the string
	{
	
	String revdata="";
	
	for(int i=str.length()-1;i>=0;i--)
	 {
		revdata=revdata+str.charAt(i);
	 }
	checkpalindrome(str,revdata);// calling method  palindrome and passing reversed string to compare with original string
	
	return revdata;
	
	}
	 
	 static void checkpalindrome(String revdata, String str)// creating method to verify palindrome
	 {
		 if(revdata.equals(str))
			{
				System.out.println(revdata+" is Palindrome");
			}
			else
			{  
				System.out.println(revdata+" is not Palindrome");
			}
	 }

}
