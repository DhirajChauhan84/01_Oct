package Loops_for_mock;

public class test_for_loop_starpattern 
{
	                                           
	public static void main(String[] args) 
	{
		for(int i = 1;  i<=7;  i=i+1)
		{
			for(int j = 1;  j<=i;  j=j+1)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}


