package Loops_for_mock;

public class task_methods_and_loop
{
	public void star()
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
