package Interface_for_mock;

public class test8 implements Sample8A,Sample8B
{
	
	public static void main(String[] args) 
	{
		test8 t8 = new test8();
		
		t8.star();
		
		t8.star2();
		
	}
	
	public void star()
	{
		/*		      *
		 * 		     * *
		 * 		    * * *
		 * 		   * * * *
		 * 		  * * * * *
		 */
		
					//i=6
		for(int i=1;i<=5;i++)
		{             //j=5 i=4
					//j=4 i=4
					//j=3 i=4		false
					//j=2 i=3			false
					//j = 1 i =2  false
			for(int j = 5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
						//k=1 i=5 
						//k=2 i=5
						//k=3 i=5		false
						//k=4 i=5 
						//k=5 i=5
						//k=6 i=5		false
			for(int k = 1; k<=i; k++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
	
	public void star2()
	{
		/*		  * * * * *
		 * 		   * * * *
		 * 		    * * *
		 * 		     * *
		 * 		      * 
		 */
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
