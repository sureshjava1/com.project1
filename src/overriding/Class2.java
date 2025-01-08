package overriding;

public class Class2 extends Class1 

{
	
	
 void overide(int a,int b,int c)
 {
	 System.out.println("this is executed from class2 "+(a+b+c));
 }


 
 public static void main(String[] args)
 {
	 Class1 sc=new Class1();
	 sc.overide(10, 40, 50);// this is called from class1 ,boz we using  obj created  for class1 
	 Class2 sc=new Class2();
	 sc.overide(10, 40, 50);// this is called from class2 ,boz we using obj created for class2
 }
 
 
}
 