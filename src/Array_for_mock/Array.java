package Array_for_mock;

public class Array 
{
	/*		Array means collection of same type of data
	 * 
	 * 		There are 2 types 
	 * 		1.Single Dimensional Array
	 * 		2.MultiDimensional Array
	 */	
	
	/*	
	 * Single Dimensional Array
	 */
	
	public static void stringArray()				//Static method
	{
		//Array declaration
		String s [] = new String[3];
		
		//Array Initialization
		s[0]="Dhiraj";
		s[1]="Rahul";
		s[2]="Abhishek";
		
		
		//Usage
		
		for(int i = 0; i<=s.length-1; i++)
		{
			System.out.println(s[i]);
		}
		
	}
	
	public static void intArray()
	{
		int I [] = new int[3];
		
		//Initialization
		I[0]=1;
		I[1]=2;
		I[2]=3;
		
		//Usage
		
		for(int i = 0; i<=I.length-1; i++)
		{
			System.out.println(I[i]);
		}
	}
	
	public void charArray()
	{
		//Array Declaration
		char c [] = new char[3];
		
		//Array Initialization
		c[0]='A';
		c[1]='B';
		c[2]='C';
		
		//Usage
		
		for(int i = 0; i<=c.length-1; i++)
		{
			System.out.println(c[i]);
		}
		
	}

	public void DoubleArray()
	{
		//declaration
		double d [] = new double[3];
		
		//Initialization
		d[0]=1;
		d[1]=1.1;
		d[2]=1.3;
		
		//Usage
		
		for(int i = 0; i<=d.length-1; i++)
		{
			System.out.println(d[i]);
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		//Creating an object
		
		Array a = new Array();
		
		//Calling static method
		stringArray();
		
		System.out.println("===========================");
		
		//Calling static method
		intArray();
		
		System.out.println("===========================");
		
		//Calling non-static method
		a.charArray();
		
		System.out.println("===========================");
		
		//Calling non-static method
		a.DoubleArray();
	}
}
