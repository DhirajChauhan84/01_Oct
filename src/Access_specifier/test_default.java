package Access_specifier;

public class test_default 
{
	// if we dont write any thing in starting of variable or method then it is default access specifier
	
	//default access specifier allows in same class, different class within a package
	//protected access specifier not allows in different package
	
	
	
	int a = 30 ;
	
	void m1()
	{
		System.out.println("Dhiraj");
		
	}
	
	public static void main(String[] args) 
	{
		test_default ob = new test_default();
		
		ob.m1();
		
		System.out.println(ob.a);
	}
	

}
