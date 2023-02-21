package Casting_for_mock;

public class multi_divide extends add_sub
{
	
	public int add()
	{
		int a = 9;
		
		int b = 9;
		
		int c = a + b;
		
		return c;
		
	}
	
	public int sub()
	{
		int a = 9;
		
		int b = 9;
		
		int c = a - b ;
		
		return c;
	}
	
	public int multi()
	{
		int a = 9;
		
		int b = 3;
		
		int c = a * b ;
		
		return c;
	}

	public int divide()
	{
		int a = 45;
		
		int b = 5;
		
		int c = a / b ;
		
		return c;
	}
	
	public static void main(String[] args) 
	{
		//Creating an object
		
		multi_divide ob = new multi_divide();
		
		System.out.println("the addition of a and b from child class Is :"+ob.add());
		
		System.out.println("the substraction of a and b from child class is :"+ob.sub());
		
		System.out.println("the multiplication of a and b is from child class:"+ob.multi());
		
		System.out.println("the division of a and b is :"+ob.divide());
		
		System.out.println("------------------------------------------------");
		//Creating an object with reference of parent class
		
		add_sub ob2 = new multi_divide();
		
		System.out.println("the addition of a and b from parent class :"+ob2.add());
		
		System.out.println("The substraction of a and b from parent class :"+ob2.sub());
		
		
		
		
		
		
		
		
		
	}
	
}
