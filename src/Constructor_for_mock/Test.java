package Constructor_for_mock;

public class Test 
{
	int a ;
	
	int b ;
	
	//Creating user-defined constructor
	
	Test()
	{
		// Initializing variable in constructor
		
		a = 100 ;
		
		b = 200 ;
		
	}
	
	public void addition()
	{
		int sum = a + b ;
		
		System.out.println("The addition of 100 and 200 is :"+sum);
		
	}
	
	public static void main(String[] args) 
	{
		Test ob = new Test();
		
		ob.addition();
		
		System.out.println("a = "+ob.a);				/*ob.a because int a is non-static global variable and we 
													calling non-static variable in static main method*/
		
		System.out.println("b = "+ob.b);					/*ob.b because int b is non-static global variable and we 
														calling non-static variable in static main method*/
		
	}

}
