package Polymorphism;

class Programmer extends Employee

{
	double basicSalary;
	int extraHours;

	public Programmer()
	{
		basicSalary=0.0;
		extraHours=0;	
	}

	public Programmer(int empId,String empName,double basicSalary,int extraHours)
	{
		super(empId,empName);
		this.basicSalary=basicSalary;
		this.extraHours=extraHours;

	}



	public double calculateSalary()
	{
		double totalSalary;
		totalSalary=basicSalary+(extraHours * 500);
		return totalSalary;
			
	}
	

	//display method overridden
	public void display()
	{
		//calling method of super class 
		super.display();		
		System.out.println("Total salary is"+calculateSalary());
	}


}
