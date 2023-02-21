package Logical_Program;

public class Armstrong_number 
{
		
		public static void main(String[] args) 
		{
			
			int orignal = 123;				// 1^3 + 5^3 + 3^3   	=	153    then its armstrong number
											//	1  + 125 + 27 		=	153
			
			int sum = 0;
			
			//Logic to check it is armstrong or not
			/*
			 * Write for loop give initial condition i = orignal
			 * and final condition as  i > 0
			 * and give incremental condition as i = i / 10
			 */
			
					//i=153
					//15
					//1
			for(int i = orignal; i>0; i = i/10)
			{
							//153		3 
							// 15		5
				int reminder = i % 10;
				
				sum = sum + (reminder * reminder * reminder);	//27 + 125 + 1
				
			}
			
			if(orignal==sum)
			{
				System.out.println(orignal + " is Armstrong Number");
			}
			else
			{
				System.out.println(orignal + " is not Armstrong Number");
			}
		}
	

}
