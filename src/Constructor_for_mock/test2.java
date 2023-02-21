package Constructor_for_mock;

public class test2 							//Parameterized Constructor
{
	int a ;							//non-static global variables
	
	int b ;
	
	
	//Creating user-defined Constructor
	
	test2()
	{
		a = 10 ;
		
		b = 15 ;
		
	}
	
	//creating user-defined parameterized Constructor
	
	test2(int x,int y)
	{
		 a = x ;
		
		 b = y ;
		
	}
	
	public void addition()						//non-static method
	{
		int sum = a + b ;
		
		System.out.println("The addition is :"+sum);
		
	}
	
	public static void main(String[] args)
	{
		//creating object
		
		test2 ob = new test2();				//here test2() is a user-defined constructor
		
		//calling method
		
		ob.addition();
		
		//creating another object of same class
		
		test2 ob2 = new test2(20,10);		//here test2(20,10) is a user-defined parameterized constructor
		
		ob2.addition();
		
		
	}
	
	
	
	
}
