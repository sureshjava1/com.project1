package employeedetails;


//create and display employee details in a company.

public class Employeeclass {
	int id;
	String name;
	char gender;
	int age;
	String dep;
	static String comp;
	int sal;
	
	public void employee()//created method for display purpose
	{
		System.out.println("Employee ID:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Gender:"+gender);
		System.out.println("Employee AGE:"+age);
		System.out.println("Employee Department:"+dep);
		System.out.println("Employee Company:Wabtec:");
		System.out.println("Employee Salary:"+sal);
	}
	
	Employeeclass(int eid,String ename,char egender,int eage,String edep,int esal)// created constructor to pass parameters .
	{
		id=eid;
		name=ename;
		gender=egender;
		age=eage;
		dep=edep;
		sal=esal;
	}
	public static void main(String[] args)
	{
		Employeeclass obj=new Employeeclass(001,"Surya",'M',45,"QA",2500000);//invoking constructor by passing input parameter values.
		obj.employee();
		Employeeclass obj1=new Employeeclass(002,"Parthos",'M',45,"CODING",3000000);
		obj1.employee();
		Employeeclass obj2=new Employeeclass(002,"Shruti",'F',42,"QA",2000000);
		obj2.employee();
				
	}

}
