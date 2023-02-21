package Array;

public class multiDimensionalArray4 
{
	public static void main(String[] args) 
	{
		// Array Declaration and Initialization
		
		int a [][] = {{1},{2,2},{3,3,3}};
		
		//Usage
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
