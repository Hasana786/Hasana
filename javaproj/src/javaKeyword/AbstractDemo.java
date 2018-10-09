package javaKeyword;

public class AbstractDemo {

	
	public static void main(String[] args) 
	{
		
		Circle c1=new Circle();
		c1.draw();
		
		Rectangle r1=new Rectangle();
		r1.draw();
		
		
		//We can not instantiate abstract class but we can make use of reference
		
		Shape s1=new Circle();
		s1.draw();
			
		
	}

}