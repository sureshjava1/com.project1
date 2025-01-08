package inherit03;

/*this is hierarchical inheritance, inherit03class1-->inherit031class2 and 
also same relation with  inherit03class1-->inherit031class3(one parent and two child's relation)*/
public class Inherit3class2 extends Inherit3class1 {
	
	public static void main(String[] args)
	{
		System.out.println(x);// we are able to call static variable "x" from other class due to parent child relation
		Inherit3class2 obj=new Inherit3class2();
		System.out.println(obj.y);// we are calling not static variable "y" which is protected with access modifier  from class1 with obj created for current class2 ,as it had parent child relation.
		
		hello1();// calling static method directly from parent class with any class reference.
		obj.hi1();// we are calling not static method "hi" from class1 with obj created for current class2 ,as it had parent child relation.
		
		
		
	}

}
