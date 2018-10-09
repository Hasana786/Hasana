package ExceptionHandling;

public class ExceptionTester6 {

	public void validateAge(int age)throws InvalidAgeException
	{
		if (age <18)
			throw new InvalidAgeException("Invalid age. Try again later ");
		
	}
	
	public static void main(String[] args) 
	{
		
		int age=17;
		
		ExceptionTester6 t= new ExceptionTester6();
		
		try 
		{
			t.validateAge(age);
			
		} 
		catch (InvalidAgeException e) 
		{
			System.out.println("Exception caught...");
		}
		
		
		
	}

}

