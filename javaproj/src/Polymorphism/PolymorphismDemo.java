package Polymorphism;

class PolymorphismDemo
{
	public static void main(String args[])
	{

		
		Employee e1=new Programmer(1001,"Swati",40000,12);
		
		e1.display();
		
		
		Employee e2=new SalesPerson(1002,"Anagha", 30000, 2500);
		e2.display();
		
				
	}
}
