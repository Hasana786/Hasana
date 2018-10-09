package ExceptionHandling;

//with exception handling
public class ExceptionTester2 {

	
	public static void main(String[] args) 
	{
		try 
		{
			int num1,num2,result;
			num1=10;
			num2=0;
			result=num1/num2;
			System.out.println("Result is  "+result);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Exception caught");


		}
		
		System.out.println("Normal program execution starts here...");
		
		
		
	}

}
