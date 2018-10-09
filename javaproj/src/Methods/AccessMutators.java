package Methods;

class AccessorMutator
{
	public static void main(String[] args) 
	{
		
		Employee e=new Employee();
		//To set values of private fields
		e.setEmpId(1001);
		e.setEmpName("Swati");
		
		//To access private field using accessor
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		
		
		
		
	}



}
