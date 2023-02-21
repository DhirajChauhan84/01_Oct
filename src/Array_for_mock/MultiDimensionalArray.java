package Array_for_mock;

public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		//Declaration
		
		int a [] [] = new int [3][3];
		
		//Initialization
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		
		//Usage
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
