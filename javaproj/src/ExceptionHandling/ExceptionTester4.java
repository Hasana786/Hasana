package ExceptionHandling;

import java.io.IOException;

//Below code demonstrate how to use throws keyword
public class ExceptionTester4 {

	
	public void m1 ()throws IOException
	{
		//throw is used to throw the exceptions explicitly
		throw new IOException("Exception...");
		
	}
	
	//Either you handle the exception or throw it.
	public void m2()throws IOException
	{
		m1();
	}
	
	public void m3()
	{
		try 
		{
			m2();
		} 
		catch (IOException e)
		{
			System.out.println(" Exception caught ");
		}
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		ExceptionTester4 e=new ExceptionTester4();
		
		e.m3();
		
	}

}

