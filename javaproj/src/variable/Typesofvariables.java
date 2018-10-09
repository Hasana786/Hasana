package variable;

public class Typesofvariables { 

	//Instance variable
	int empId;
	String empName; 
	//Static variable
	static String compName;
	
	public static void main(String[] args)
	{
		//Local variable
		int i;
		i=10;
		System.out.println("Local variable i "+ i);
		
		//Create object to access instance variables
		Typesofvariables e=new Typesofvariables();
		System.out.println("Instance variable "+e.empId + "  "+ e.empName);
		
		//static variable can be accessed directly in static context.
		System.out.println("Static variable "+compName);
		
		
		
		
	}



}
