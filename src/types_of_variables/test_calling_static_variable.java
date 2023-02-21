package types_of_variables;

public class test_calling_static_variable 
{
	static int a = 9;						//static global variable
	
	
	public static void main(String[] args) 
	{
		//callng static variable in static method in same class
		
		// caling static variable and calling it
		
		System.out.println(a);
		
		//calling static method
		
		m1();
		
		//creating object for calling non-static method
		
		test_calling_static_variable ob =new test_calling_static_variable();
		
		ob.m2();
		
	}
	
	public static void m1()
	{
		//callng static variable in static method in same class
		
		// caling static variable and calling it
		
		System.out.println(a);
		
	}
	
	public void m2()
	{
		//callng static variable in non-static method in same class
		
		// caling static variable and calling it
		
		System.out.println(a);
	}

}
