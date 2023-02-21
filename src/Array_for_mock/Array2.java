package Array_for_mock;

import java.util.Arrays;

public class Array2 
{
	public static void main(String[] args) 
	{
		Array2.stringArray();
		
		Array2.intArray();
		
		Array2.charArray();
		
	}
	
	public static void stringArray()
	{
		System.out.println("For String Array");
		
		//Declaration and Initialization
		
		String s [] = {"Dhiraj","Amol","Rahul","Abhishek"};
		
		//Usage
		
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("============================");
		
		// To Ascending Order
		
		Arrays.sort(s);					//This is a sort() from Array class
		
		System.out.println("In Ascending Order");
		
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("=============================");
		
		//To Descending Order
		
		System.out.println("In Descending Order");
		
		for(int i = s.length-1; i>=0; i--)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("==============================");
	}

	public static void intArray()
	{
		System.out.println("For int Array");
		
		//Declaration and Initialization
		
		int I [] = {4,2,5,3,1};
		
		//Usage
		
		for(int i = 0; i<I.length;i++)
		{
			System.out.println(I[i]);
		}
		
		System.out.println("================================");
		
		//To Ascending Order
		
		System.out.println("In Ascending Order");
		
		Arrays.sort(I);
		
		for(int i = 0; i<I.length;i++)
		{
			System.out.println(I[i]);
		}
		
		System.out.println("=================================");
		
		//To Descending Order
		
		System.out.println("In Descending Order");
		
		for(int i = I.length-1; i>=0; i--)
		{
			System.out.println(I[i]);
		}
		
		System.out.println("==================================");
		
	}

	public static void charArray()
	{
		System.out.println("For Char Array");
		
		//Declaration and initialization
		
		char c [] = {'C','D','A','B'};
		
		//Usage
		
		for(int i = 0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("===========================");
		
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
		
		System.out.println("===============================");
	}
}
