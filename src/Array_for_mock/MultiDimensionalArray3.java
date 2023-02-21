package Array_for_mock;

public class MultiDimensionalArray3 
{
	public static void main(String[] args) 
	{
		//Declaration and Initialization
		
		char c [][]= {{'A','B','C'},{'D','E','F','G'},{'H','I','J','K','L'},{'M','N','O','P'},{'R','S','T'}};
		
		//Usage
		
	//	System.out.println("c[0][0] :"+c[4][2]);
		
		for(int i = 0; i<c.length; i++)
		{
			for(int j = 0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			
			System.out.println();
		}
		
		
	}

}
