package Array;

public class Array2 
{
	public static void main(String[] args) 
	{
		//for intArray
		
		System.out.println("For int Array");
		
		//Array declaration and initialization
		
		int a []= {1,2,3,4,5};
		
		//Usage
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("===========================");
		
		
		//for StringArray
		
		System.out.println("For String Array");
		
		//Array declaration and initialization
		
		String s [] = {"Dhiraj","Rahul","Abhishek","Amol","Mahesh"};
		
		
		//Usage
		
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
			
		}
		
		System.out.println("===========================");
		
		
		//For CharArray
		
		//Array declaration and initialization
		
		char c [] = {'A','B','C','D'};
		
		//Usage
		
		for(int i = 0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
	}
	

}
