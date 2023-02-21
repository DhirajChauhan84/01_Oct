package Methods;

public class test4 
{         // non-static method call from same class
	public static void main(String[]args)
	{
		System.out.println("Hi..I am main method");
		
		//creating object
		test4 t1 = new test4();
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();
		
	}
	
	public void m1()
	{
		System.out.println("Hi.. I am m1 method");
		
	}
	
	public void m2()
	{
		System.out.println("Hi.. I am m2 mehod");
		
	}
	public void m3()
	{
		System.out.println("Hi.. I am m3 method");
		
	}
	public void m4()
	{
		System.out.println("Hi.. I am m4 method");
	}

}
