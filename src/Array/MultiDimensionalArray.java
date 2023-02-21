package Array;

public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		
		//Declaration
		
		int a [][] = new int [3][3];
		
		
		/*			0	1
		 * 		0	1	2
		 * 		1	3	4
		 * 		2	5	6
		 */
		//Initialization
		
		a[0][0] = 1 ;
		a[0][1] = 2 ;
		a[1][0] = 3 ;
		a[1][1] = 4 ;
		a[2][0] = 5 ;
		a[2][1] = 6 ;
		
		
		
		
		//Usage		
		for(int i = 0; i<=3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
