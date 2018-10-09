package Inheritance;

class Employee  
{
	
	private int empId;
	private String empName;
	
		
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void display()
	{
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee name is"+empName);
	}
	
}

