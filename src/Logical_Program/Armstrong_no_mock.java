package Logical_Program;

import java.util.Scanner;

public class Armstrong_no_mock 
{
		public static void main(String[] args) 
		{
			
			//int a = 157;
			
			// 1^3 + 5^3 + 3^		=	153
			// 1 + 125 = 27			=	153
			
			int add = 0 ;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number");
			
			int a = sc.nextInt();
			
			
			
			
			// for loop
			// starting condition i = 153
			// end condition i>=1 	/  i > 0
			// increment condition i = i / 10	i % 10
			
								//   153
								//   15
								//	  1
			for(int i = a; i > 0; i= i / 10)
			{
							  //3
							  //5
							  //1
				int remainder = i % 10;
						
							// 3		  3         3			 27
							// 5 		  5         5			125
							// 1		  1 		1			 1
				add = add + (remainder*remainder*remainder);
			}
			
			System.out.println(add);
			
			if(a==add)
			{
				System.out.println(a+" is Armstrong");
			}
			else
			{
				System.out.println(a+" is Not Armstrong");
			}
			
			
			
		}

}
