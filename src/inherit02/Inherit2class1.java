package inherit02;

import Inherit01.Inherit1class2;// this is having multi level inheritance, inherit01class1-->inherit011class2--->inherit02class1


public class Inherit2class1 extends Inherit1class2 { 
	
	public static void main(String[] args)
	{
		System.out.println(a); // the variable "a" is public access modifier with multi level inheritance,
		System.out.println(b);// the variable "b" is protected access modifier ,hence we are able to access out of package in child class. 
		
	}

}
  