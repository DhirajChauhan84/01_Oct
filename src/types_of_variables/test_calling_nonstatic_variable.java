package types_of_variables;

public class test_calling_nonstatic_variable 
{
	int a = 12;								//non-static gloabal variable
	
	public static void main(String[] args) 
	{
		//callng nonstatic variable in static method in same class
		
		//creating local object of same class for calling non-staic variable
		
		test_calling_nonstatic_variable ob = new test_calling_nonstatic_variable();
		
		//calling non-static variable and printing it
		
		System.out.println(ob.a);
		
		//calling static method m1
		m1();
		
		//calling non-static method m2
		
		ob.m2();
		
		
		
		
	}
	
	public static void m1()
	{
		//callng nonstatic variable in static method in same class
		
		//creating local object of same class for calling non-staic variable
		
		test_calling_nonstatic_variable ob1 = new test_calling_nonstatic_variable();
		
		//calling non-static variable and printing it
		
		System.out.println(ob1.a);
	}
	
	public void m2()
	{
		//callng nonstatic variable in non-static method in same class
		
		//calling non-static variable and printing it
		
		System.out.println(a);
		
	}

}
