package Constructor;

public class test 
{
	int a ;         //global non-static variable
	int b ;
	
	test()                     //constructor
	{
		a = 20 ;
		b = 40 ;
		
	}
	
	public void multiplication()
	{
		int multi = a * b ;
		
		System.out.println(multi);
	}
	

}
