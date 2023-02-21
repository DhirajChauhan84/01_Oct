package Methods;

public class test7 
{
	public static void main(String[]args)
	{
		//calling static method
		m1();
		
		//creating object 
		
		test7 t1 = new test7();
		
		//calling non static method
		t1.m2();
		
		//calling non static method from another class
		
		test8.m3();
		
		//creating object of test8 for non satic method
		
		test8 t2 = new test8();
		
		//calling non static method from anoter class
		
		t2.m4();
	}
	//static method from same class
	public static void m1()
	{
		System.out.println("HI.... i am m1 method from same class");
	}
	
	public void m2()
	{
		System.out.println("Hi... i am m2 method from same class");
	}

}
