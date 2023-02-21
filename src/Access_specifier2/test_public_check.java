package Access_specifier2;

import Access_specifier.test_public;

public class test_public_check 
{
	public static void main(String[] args) 
	{
		test_public ob = new test_public();	
		
		ob.m2();				//public method m2 is access from different class in different package
		
		System.out.println(ob.a);	//public variable a is access from different class in different package
		
	}

}
