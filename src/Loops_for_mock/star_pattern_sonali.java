package Loops_for_mock;

public class star_pattern_sonali 
{
	public static void main(String[] args) 
	{      //  i=1       1<=5                            * 
		 //              2<=5                            * * 
		    //       3<=5                                * * * 
		//               4<=5                            * * * * 
		//             5<=5                              * * * * *    
		//                                               
		for(int i = 1;   i<=5;   i=i+1)
		{
			for(int j = 1;  j<=i;  j=j+1)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
