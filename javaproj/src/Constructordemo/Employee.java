package Constructordemo;

public class Employee  
{
	
	private int empId;
	private String empName;
	
	//Default constructor
	
	public Employee()
	{
		System.out.println("Default constructor invoked ");
	}
	
	
	
	//parameterised constructor
	
	public Employee(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Parameterised constructor invoked ");
	}
	

	public void display()
	{
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee name is"+empName);
	}
	
	

}
