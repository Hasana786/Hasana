package ExceptionHandling;

//Below code demonstarte how to use finally
public class ExceptionTester3 {

	
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
		finally
		{
			System.out.println("inside finally block..");
		}
		
		System.out.println("Normal program execution starts here...");
		
		
		
	}

}

