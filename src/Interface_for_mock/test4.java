package Interface_for_mock;

public class test4 implements Sample4A,Sample4B
{
	public static void main(String[] args) 
	{
		test4 t4 = new test4();
		
		t4.d();
		
		t4.name();
		
		t4.surname();
		
		t4.city();
		
		t4.position();
		
		t4.d();
		
		
	}
	
	public void name()
	{
		System.out.println("Name of the Employee: Dhiraj");
	}
	
	public void surname()
	{
		System.out.println("Surname of the Employee: Rajput");
	}
	
	public void city()
	{
		System.out.println("City of the Employee: Pune");
	}
	
	public void position()
	{
		System.out.println("Role of the Employee: Quality Analyst");
	}
	
	

}
