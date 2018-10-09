package classesandobjects;

public class EmployeeTester {
	
	

		public static void main(String[] args)
		{
			
			//creating object of employee class
			Employee e1=new Employee();
			e1.empId=1001;
			e1.empName="Swati";
			
			System.out.println("Employee Id is "+e1.empId);
			System.out.println("Employee name is "+e1.empName);
			
			
			Employee e2=new Employee();
			e2.empId=1002;
			e2.empName="Priya";
			
			System.out.println("Employee Id is "+e2.empId);
			System.out.println("Employee name is "+e2.empName);
			
			
		}

	}

