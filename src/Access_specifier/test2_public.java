package Access_specifier;

public class test2_public 
{
	public static void main(String[] args) 
	{
		test_public ob = new test_public();
		
		ob.m2();			//public method m2 is access from different class in same package
		
		System.out.println(ob.a);	//public variable a is access from different class in same package
		
	}

}
