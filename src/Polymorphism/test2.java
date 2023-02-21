package Polymorphism;

public class test2 
{
	//Method Overloading
	
	
	public void m1() 
	{
		System.out.println("Hi...");
		
		
	}
	public void m1(int a)
	{
		System.out.println("Hlw..");
		
	}
	
	public void m1(String name)
	{
		System.out.println("Hello");
		
	}
	
	public void m1(int c, int b)
	{
		System.out.println("Gud morning");
		
	}
	public static void m1(String n,int a)
	{
		System.out.println("fdfds");
	}
	
	public static void main(String[] args) 
	{
		
		test2 ob = new test2();
		
		ob.m1();
		
		ob.m1(3);

		ob.m1("Dhiru");
		
		ob.m1(3, 4);
		
		m1("Dhiraj",12);
		
		
	}

}
