package Array_for_mock;

public class test 
{
	public void singleDimensionalArray()
	{
		System.out.println("The Single Dimensional Array");
		
		int a[]= {1,2,3,4};
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("=====================");
	}

	public void multiDimensionalArray()
	{
		System.out.println("The Multi Dimensional Array");
		
		int a[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("=====================");
	}

	public static void main(String[] args) 
	{
		test t = new test();
		
		t.singleDimensionalArray();
		
		t.multiDimensionalArray();
		
	}
}
