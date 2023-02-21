package Access_specifier;

public class test_public 
{
	//Public access specifier allows the variable method and class to anywhere in project
	
	public int a = 100 ;
	
	public void m2()
	{
		System.out.println("Dhiraj");
	}
	
	public static void main(String[] args) 
	{
		test_public ob = new test_public();
		
		ob.m2();
		
		System.out.println(ob.a);
		
	}

}
