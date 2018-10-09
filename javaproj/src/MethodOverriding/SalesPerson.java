package MethodOverriding;

class SalesPerson extends Employee
{
		private double basicSalary;
		private int incentive;
		
		
		public SalesPerson()
		{
			
			super();  //calling super class constructor
			basicSalary=0.0;
			incentive=0;
		}

		public SalesPerson(int empId,String empName,double basicSalary,int incentive)
		{
			//passing parameters to super class constructor by using super
			super(empId,empName); 
			this.basicSalary=basicSalary;
			this.incentive=incentive;


		}

		public double calculateSalary()
		{
			double totalSalary;
			totalSalary=basicSalary+incentive;
			return totalSalary;
			
		}
		
		public void display()
		{
			//calling method of super class 
			super.display();		
			System.out.println("Total salary is "+calculateSalary());
		}



}