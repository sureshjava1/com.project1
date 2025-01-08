package calculator;

public class Executioncalculatorclass {
	
	public static void calexecution()
	{
		Calculatorlogicclass obj = new Calculatorlogicclass();
		obj.add(20, 30);
		Calculatorlogicclass.sub(100, 20);
		obj.mul(5);
		obj.div(25,5);
		System.out.println(Calculatorlogicclass.z);//accessing global/static variable from different class
		System.out.println(obj.s);// accessing instance variable from different class
		
	}


	public static void main(String[] args)
	{
	
		calexecution();
	}
}
