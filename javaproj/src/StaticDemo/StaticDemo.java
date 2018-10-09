package StaticDemo;

class StaticDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee(1001,"Swati");
		e1.display();
		
		Employee e2=new Employee(1002,"Pooja");
		e2.display();
		
		
		//static members can be accessed without object 
		Employee.method1();
		
				
	}
}
