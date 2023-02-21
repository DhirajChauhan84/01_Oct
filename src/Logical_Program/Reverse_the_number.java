package Logical_Program;

public class Reverse_the_number 
{
	public static void main(String[] args) 
	{
		int orignal = 2148;
		
		int rev = 0;
		
		for(int i = orignal; i>0; i = i / 10)
		{
			
				int remainder = i % 10;
				
				 rev = rev * 10 + remainder ;
		}
		
		System.out.println(rev);
		
	}

}
