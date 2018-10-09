package StaticDemo;

public class Employee  
{
	
	private int empId;
	private String empName;
	private static String companyName="Accenture";
		
		
	public Employee()
	{
		empId=0;
		empName="Not set";
	}
		
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;

	}
	
	public void display()
	{
		System.out.println("*****************************************************");
		System.out.println("Employee Id is   "+empId);
		System.out.println("Employee name is "+empName);
		System.out.println("Company name is  "+companyName);
	}
	
	public static void  method1()
	{
		System.out.println("Static method ");
	}
			
	
}


