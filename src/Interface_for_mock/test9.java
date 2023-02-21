package Interface_for_mock;

public class test9 implements Sample9A,Sample9B
{
	public static void main(String[] args) 
	{
		test9 t9 = new test9();
		
		t9.star();
		
		t9.star2();
		
	}
	
	public void star()
	{
		/*		     *
		 * 		    ***
		 * 		   *****
		 * 		  *******
		 * 		 *********
		 */
		
		for(int i = 1; i<=5; i++)
		{
			for(int j = 5; j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k<(i*2);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public void star2()
	{
		/*		 *********
		 * 		  *******
		 * 		   *****
		 * 		    ***
		 * 		     *     
		 */
		for(int i = 1; i<=5;i++)
		{
			for(int j = 1 ; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 5; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int l =4; l>=i; l--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
