package Interface_for_mock;

public class test2 implements Sample2		//Implementation Class
{
	public void star()
	{								// Method Definition
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star2()
	{	
		for(int i = 5; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
	}
		
	
	
	public static void main(String[] args) 
	{
		test2 t2 = new test2();
		
		t2.star();
		
		t2.star2();
		
	}

}
