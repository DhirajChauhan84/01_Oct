package Polymorphism_for_mock;

public class test_overloading 
{
	//Polymorphism performing single task in different ways
		//method m1 created with different different parameters
		
		/*Declaring multiple methods with same name but different parameter
		 * in the same class called as Method Overriding
		 * Also called as Compile time polymorphism / early biding / static biding
		 * 
		 * declaration binded with definition at compile time based argument 
		 */	
	
	public int add()				//method declaration
	{
		int a = 10 ;
		
		int b = 20 ;				//method defination
		
		int sum = a+b;
		
		return sum;
	}
	
	public int add(int i)
	{
		int a = 20 ;
		int b = 20 ;
		
		int sum = a+b ;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		//Creating an object
		
		test_overloading ob = new test_overloading();
		
		System.out.println(ob.add());
		
		System.out.println(ob.add(1));
		
	}

}
