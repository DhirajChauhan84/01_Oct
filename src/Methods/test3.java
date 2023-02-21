package Methods;

public class test3
{  //Non-static regular method call from same class
	
	public static void main(String[]args)
	{
		System.out.println("Hello");
		
		// Creating object
		
		test3 t1 = new test3();
		t1.method();
	}
	
	public void method()
	{
		System.out.println("Hi");
	}

}
