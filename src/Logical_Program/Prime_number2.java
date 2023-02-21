package Logical_Program;

import java.util.Scanner;

public class Prime_number2 
{
	// Identify given no is prime or not
		//Prime number: 
	
	//	By using Scanner
	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number");
			
			int orignal = sc.nextInt();
			
			int count=0;
			
			
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
				System.out.println("Number is not a prime number");
			}
			else
			{
				System.out.println("Number is prime number");
			}
			
			
		}

}
