package Constructor;

public class test2 
{
	int x ;
	int y ;
	
	test2()
	{
		x = 20 ;
		y = 10 ;
		
	}
	
	test2(int a, int b)
	{
		x = a ;
		y = b ;
		
	}
	
	public void add()
	{
		int sum = x + y ;
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) 
	{
		test2 t2 = new test2();
		t2.add();
		
		test2 t3 = new test2(50,10);
		t3.add();
		
	}
}
