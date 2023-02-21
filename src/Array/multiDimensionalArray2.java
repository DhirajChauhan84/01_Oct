package Array;

public class multiDimensionalArray2 
{
	public static void main(String[]args)
	{
		int a [] [] = new int [3][4];
		
		
		/*		0 1 2 3
		 *  
		 * 0	1 2 3 4
		 * 1	5 6 7 8
		 * 2	9 10 11 12
		 */
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=4;
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		a[1][3]=8;
		a[2][0]=9;
		a[2][1]=10;
		a[2][2]=11;
		a[2][3]=12;
	
		for(int i = 0; i<=2; i++)
		{
			for(int j = 0; j<=3; j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			
			System.out.println();
		}
	}

}
