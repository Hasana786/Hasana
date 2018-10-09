package Inheritance;

class SalesPerson extends Employee
{
		private double basicSalary;
		private int incentive;
		
		
		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public int getIncentive() {
			return incentive;
		}

		public void setIncentive(int incentive) {
			this.incentive = incentive;
		}

		public double calculateSalary()
		{
			double totalSalary;
			totalSalary=basicSalary+incentive;
			return totalSalary;
			
		}
		
		public void display()
		{
			//getEmpID() and getEmpName() methods are accessible here. 
			System.out.println("Employee id "+getEmpId());
			System.out.println("Employee name is"+ getEmpName());			
			System.out.println("Total salary is "+calculateSalary());
		}



}
