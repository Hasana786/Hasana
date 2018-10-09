package MethodOverriding;

class Employee  
{
	
	private int empId;
	private String empName;
	
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
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee name is"+empName);
	}
	
}
