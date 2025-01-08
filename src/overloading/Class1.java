package overloading;

/*overloading: 
ability to define multiple methods with the same name in the same class, 
but with different parameters. The compiler can distinguish between these methods
 based on the number, type, and order of the parameters.*/


public class Class1 {
	
	   void overload(int a, int b)
	  {
	  	System.out.println(a+b);
	  }


	    void overload(int a,int b,int c)
	     {
	     	System.out.println(a+b+c);
	     }

}
