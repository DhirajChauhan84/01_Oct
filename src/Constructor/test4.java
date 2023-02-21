package Constructor;

public class test4 
{
	int a ;
										//non-static global variables
	int b ;
	
	
	test4()								//user-defined constructor
	{
		this(20,10);					//this function use to access global variable a and b
	}
	
	test4(int x)						//user-defined parameterized constructor
	{
		
		
	}
	
	test4(int y,int z)						//user-defined parameterized constructor
	{
		a = y;
		
		b = z ;
		
	}
	
	public void add()						//non-static method
	{
		int sum = a + b ;
		
		System.out.println(sum);
		
	}

	
	public static void main(String[] args) 
	{
		
		test4 ob = new test4(50,20);			//creating object
		
		ob.add();
		
		
	}
}
