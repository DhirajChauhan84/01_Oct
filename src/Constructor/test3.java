package Constructor;

public class test3 
{
	int a ;
	int b ;
	
	String name;
	
	test3()
	{
		a = 10;
		
		b = 20;
		
	}
	
	test3(int x, int y)
	{
		a = x ;
		
		b = y ;
		
	}
	
	test3(String n)
	{
		name = n ;
		
	}
	
	public void multi()
	{
		int ans =	a * b ;
		
		System.out.println(ans);
	}
	
	public void nm()
	{
		System.out.println(name);
	}
	

}
