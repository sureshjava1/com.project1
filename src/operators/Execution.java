package operators;

import java.util.Scanner;

public class Execution {
	
      
	public static void main(String[] args)
	{
    	   @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
    	   System.out.println("Enter the value of X");
    	   int x=sc.nextInt();
    	   System.out.println("Enter the value of Y");
    	   int y=sc.nextInt();
    	   System.out.println("Enter the value of Z");
    	   int z=sc.nextInt();
		Datamaintain obj1=new Datamaintain (x,y,z);//invoking "Datamaintain"constructor from "Data maintain" class and passing input parameters to constructor
		
		Codelogic obj2=new Codelogic();
		obj2.sum(obj1.x, obj1.y);//the data from "Data maintain" constructor was used as input to the "sum" method in "code logic" class.
		obj2.sub(obj1.x, obj1.y);
		Codelogic.mul(10,6);// static method "mul" created in "code logic" class.
		obj2.div(obj1.z, obj1.x);
		obj2.rem(obj1.y, obj1.x);
		/* calling the method "greater than" from "Code logic" class and passing the input parameters 
		from the "Data maintain" constructor and storing the result in boolean local variable "b" */
		boolean b1=obj2.greaterthan(obj1.x, obj1.y);
		System.out.println(b1);
		boolean b2= obj2.lessthan(obj1.x, obj1.y);
		System.out.println(b2);
		boolean b3= obj2.greaterthanequal(obj1.x, obj1.y);
		System.out.println(b3);
		boolean b4= obj2.lessthanequal(obj1.x, obj1.y);
		System.out.println(b4);
		boolean b5= obj2.equalto(obj1.x, obj1.y);
		System.out.println(b5);
		boolean b6= obj2.notequalto(obj1.x, obj1.y);
		System.out.println(b6);
		/* calling non static  methods from "Logical operator" class, which uses as input from methods present in  "code logic "class
		 * and the methods from  "code logic "class uses the variables declared in 
		 *  "Data maintain" class with the help of "Data maintain" constructor as the source of input.*/
		Logicaloperator lo=new Logicaloperator();
		boolean l1=lo.and(obj1.x, obj1.y);
		System.out.println(l1);
		boolean l2=lo.or(obj1.x, obj1.y);
		System.out.println(l2);
		boolean l3=lo.reverseoperator(obj1.x, obj1.y);
		System.out.println(l3);
		lo.incremental();// calling non static method from "Logical operator" class.
		lo.decremental();
		lo.assig();
		Logicaloperator.boolassign();// calling static method from "Logical operator" class.
	
		
		
	}
	
}
