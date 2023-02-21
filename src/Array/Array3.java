package Array;

import java.util.Arrays;

public class Array3 
{
	public static void main(String[] args) 
	{
	
		Array3 ob = new Array3();
		
		ob.intArray();
		
		ob.stringArray();
		
		ob.charArray();
		
	}
	
	public void intArray()
	{
		//Array declaration and initialization
		
				int a [] = {2,4,1,3,5};
				
				//Usage
				
				for(int i = 0; i<a.length; i++)
				{
					System.out.println(a[i]);
				}

				System.out.println("=======================");
				
				
				 // To ascending Order
					
				Arrays.sort(a);
				
				System.out.println("In Ascending Order");
				
				for(int i = 0; i<a.length; i++)
				{
					System.out.println(a[i]);
				}
				
				System.out.println("============================");
				
				//To descending Order
				
				System.out.println("In Descending Order");
				
				for(int i = a.length-1; i>=0; i--)
				{
					System.out.println(a[i]);
				}
				
				System.out.println("=============================");
				
	}

	public void stringArray()
	{
		//Array declaration and initialization
		
		String s [] = {"Dhiraj","Rahul","Amol","Abhishek"};
		
		//Usage
		
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("============================");
		
		//To Ascending Order
		System.out.println("In ascending Order");
		
		Arrays.sort(s);
		
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("==============================");
		
		//To Descending Order
		
		System.out.println("In Descending Order");
		
		for(int i = s.length-1; i>=0; i--)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("=============================");
			
	}

	public void charArray()
	{
		char c [] = {'C','A','D','B'};
		
		//Usage
		
		for(int i = 0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		//To Ascending Order
		
		System.out.println("In Ascending Order");
		
		Arrays.sort(c);
		
		for(int i = 0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("==============================");
		
		//To Descending Order
		
		System.out.println("In Descending Order");
		
		for(int i = c.length-1; i>=0; i--)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("==============================");
	}
	
}
