package Access_specifier;

public class test_protected 
{
	/*protected access specifier allows in same class, 
	different class within a package and outside the package only in child class */
	
	
	
	protected int a = 10 ;			//non-static global variable
	
	
	protected void m1()				//non-static method
	{
		System.out.println("Dhiraj");
	}
	
	public static void main(String[] args) 
	{
		test_protected ob = new test_protected();
		
		ob.m1();
		
		System.out.println(ob.a);
		
	}

}
