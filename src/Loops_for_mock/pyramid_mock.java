package Loops_for_mock;

public class pyramid_mock 
{
	/*1 
	 *2 2
	 *3 3 3
	 *4 4 4 4
	 *5 5 5 5 5
	 */
	
	public static void main(String[] args) 
	{
		for(int a = 1; a<=5; a++)
		{
			for(int b = 1; b<=a; b++)
			{
				System.out.print(b+ " ");
			}
			System.out.println(" ");
		}
		
	}

}
