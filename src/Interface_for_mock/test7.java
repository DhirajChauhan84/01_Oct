package Interface_for_mock;

public class test7 implements Sample7A,Sample7B
{
	public static void main(String[] args) 
	{
		test7 t7 = new test7();
		
		t7.star();
		
		t7.star2();
		
	}
	public void star()
	{
		/*		    *
		 * 		   **
		 * 		  ***
		 * 		 ****
		 * 		*****
		 */
		for(int a = 1; a<=5; a++)
		{
			for(int b = 5; b>=a; b--)
			{
				System.out.print(" ");
			}
			for(int c = 1;c<=a;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star2()
	{
		/*		 
		 * 		 *****
		 * 		  ****
		 * 		   ***
		 * 		    **
		 * 		     *
		 * 
		 */
		for(int i = 1; i<=5;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 5; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void dot()
	{
		
	}

}
