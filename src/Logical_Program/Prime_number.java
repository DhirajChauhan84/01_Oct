package Logical_Program;

public class Prime_number 
{
		// Identify given no is prime or not
	//Prime number: 
	
		public static void main(String[] args) 
		{
			int orignal = 7 ;
			
			int count = 0;
			
			for(int i = 2; i < orignal; i++)
			{
				if(orignal % i == 0)
				{
					count++;
					
					break;
				}
			}
			
			if(count==1)
			{
				System.out.println("The number is not prime number");
			}
			else
			{
				System.out.println("The number is prime number");
			}
			
		}

}
