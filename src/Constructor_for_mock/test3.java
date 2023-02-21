package Constructor_for_mock;

public class test3 
{
	int a ;					//non-static global variables

	int b ;
	
	 String c ;
	
	//creating constructor
	
	test3()
	{
		a = 1 ;
		
		b = 2 ;
		
	}
	
	//creating parameterized constructor
	
	test3(String d)
	{
		c = d ;
		
	}
	
	public void add()
	{
		int sum = a + b ;
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	{
		//creating object
		
		test3 ob = new test3();				//here test3() is user-defined constructor
		
		//calling method
		
		ob.add();
		
		//creating another object
		
		test3 ob2 = new test3("Dhiraj");	//here test3("Dhiraj") is a user-defined parameterized constructor
		
		System.out.println(ob2.c);
		
				
		
	}
}
