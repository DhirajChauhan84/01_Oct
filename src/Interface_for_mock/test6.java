package Interface_for_mock;

public class test6 implements Sample6A,Sample6B
{
	
	public static void main(String[] args) 
	{
		test6 t6 = new test6();
		
		//System.out.println(a);
		
		t6.star();
		
		//System.out.println(b);
		
		t6.star2();
		
	}
	
	public void star()
	{
		/*		* 
		 * 		* * 
		 * 		* * * 
		 * 		* * * *
		 * 		* * * * *
		 * 		* * * * * *
		 */
		for(int i = 1;i<=6; i++ )
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void star2()
	{
		/*		* * * * * * 
		 * 		* * * * * 
		 * 		* * * * 
		 * 		* * * 
		 * 		* * 
		 * 		* 
		 */
		for(int i = 7;i>=1; i--)
		{
			for(int j = 1; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
