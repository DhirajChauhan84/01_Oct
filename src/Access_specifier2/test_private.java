package Access_specifier2;

public class test_private 
{
	//private access specifier allows only within a class 
	//private access specifier not allows in other class in package and outside the package
	private int a = 50 ;
	
	
	private void m1()
	{
		System.out.println("Dhiraj");
	}
	
	public static void main(String[] args) 
	{
		
		test_private ob = new test_private();
		
		ob.m1();
		
		System.out.println(ob.a);
		
	}

}
