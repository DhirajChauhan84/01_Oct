package Array_for_mock;

public class MultiDimensionalArray2 
{
	public static void main(String[] args) 
	{
		//Declaration and Initialization
		
		int a [][]= {{1,2,1,4},{2,3,1,4,5},{6,7,9,0,6},{1}};
				
		
		//Usage
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
