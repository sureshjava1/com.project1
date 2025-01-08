package stringclass;

public class Stringmethods {
	
	public static void main(String[] args)
	{
		String str="welcome to office";// poled memory is applicable for these type o strings as new memory was not allocated
		
		String str1=new String("welcome to office");//poled memory is not applicable for these type o strings as new memory was created with "new" keyword.
		
		
		System.out.println(str.charAt(0));// here we are using variable "str" and method "charAt" the o/p: "w"
		
		char c= str.charAt(0);// we can also store the out put of the method in variable "c" and use as input in some other method.
		
		System.out.println(str.codePointAt(2));// it prints the ASCII value of the character 'l' which is present at index 2, o/p:108
		
		System.out.println(str.codePointBefore(2));//it prints the ASCII value of the character 'e' which is present before index 2, o/p:101
		
		System.out.println(str.compareToIgnoreCase(str1));// it compares both the strings "str" and "str1", the o/p will be -/+ values.
	
		System.out.println(str.concat(str1));// adding two strings
		
		System.out.println(str.contains("welc"));// it checks the same portion of  content "welc" is present in string in the same sequence and o/p is boolean
	    
		System.out.println(str.contentEquals(str1));// it checks exact same content in two strings
	   
		System.out.println(str.endsWith("e"));// check the string ending with "e" and returns boolean
		
		System.out.println(str.equals("wel")); 
		
		System.out.println(str.equalsIgnoreCase("wel"));
		
		System.out.println(str.indent(2));// it gives two spaces before the string, o/p :  welcome to office
		
		System.out.println(str.strip());// it removes all the empty spaces before and after end of the string
		
		System.out.println(str.stripLeading());//it removes all the empty spaces before starting of the string
		
		System.out.println(str.stripTrailing());//it removes all the empty spaces after end of the string
		
		System.out.println(str.indexOf('e'));// it calculates the first index of  letter 'e' in the string.
		
		System.out.println(str.indexOf("com")); // it calculates the index of first letter 'c' in the string "com"
		
		
		System.out.println(str.lastIndexOf('e'));// it calculates the last index of  letter 'e' in the string.
		
		System.out.println(str.indexOf('o', 5, 11));// it calculates the  index of  letter 'o' position between 5 to 11 in the string.
				
		System.out.println(str.intern());// returns the same string
				
		System.out.println(str.length());
				
		System.out.println(str.repeat(3));// it repeats the same string no of  times 
		
		System.out.println(str.replace('c', 'R'));// it replaces the character 'c' with character 'R' in the string
		
		System.out.println(str.startsWith("w"));// it checks weather the string is starting with lower case "w"
		
		System.out.println(str.endsWith("e"));// it checks weather the string is ending  with lower case "e"
		
		System.out.println(str.substring(3));// it will consider the remaining portion of string after the  index position   of 3 
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toCharArray());
		
		//System.out.println(str.split());
		
		String ss=" ";
		System.out.println(ss.isEmpty());// there is space in the string, hence out put  is false
		System.out.println(ss.isBlank());// there is no value in the string ,hence output is true
		
	}

}
