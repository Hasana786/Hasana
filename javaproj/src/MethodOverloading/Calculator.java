package MethodOverloading;

class Calculator
{
	
   public void addition()
   {
	   int num1,num2,result;
	   num1=10;
	   num2=20;
	   result=num1+num2;
	   System.out.println("Addition of "+num1+ " and "+num2+" is "+result);
	   
   }
   public void addition(int num1,int num2)
   {
	   int result;
	   result=num1+num2;
	   
	   System.out.println("Addition of "+num1+ " and "+num2+" is "+result);
	   
   }
   
   



}
