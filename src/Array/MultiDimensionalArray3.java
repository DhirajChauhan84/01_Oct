package Array;

public class MultiDimensionalArray3 
{

	public static void main(String[]args)
	{
		//Declaration and initialization
		
		int a [] [] = {{11,12,13},{11,12,13,14,15}};		
		
		//Usage
		
		/*		0  1  2  3  4
		 * 
		 * 0	11 12 13 
		 * 1	11 12 13 14 15
		 */
	
		for(int i = 0; i<a.length; i++)				//a.length is size of the rows
		{
			for(int j = 0; j<a[i].length; j++)		//a[i].length is size of the columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
