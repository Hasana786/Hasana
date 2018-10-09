package MethodOverriding;

public class MethodOveriddingDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee(1001,"Rahul");
	
		e1.display();


		SalesPerson s1=new SalesPerson(1002,"Sahin",4000,1200);
		
		//Super class's display() method overridden
		s1.display();



	}


}