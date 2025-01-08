package overriding;


/*overriding:
creating same method name with same input parameters but in different class ,with parent and child relation 
note: overriding will not be applicable for static methods.boz the static methods are sticking to the memory of that class.*/
public class Class1 {
	
	
	 void overide(int a,int b,int c)
	 {
		 System.out.println("this is executed from class1 "+(a+b+c));
	 }

}
 