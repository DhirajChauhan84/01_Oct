package Array;

public class multiDimensionalArray5 
{
	public static void main(String[] args) 
	{
		//Declaration and Initialization
		
		String s[][]= {{"Dhiraj"},{"Dhiraj","Rajput"},{"Rahul"},{"Rahul","Chavan"}};
		
		//Usage
		
		for(int i = 0; i<=3; i++)
		{
			for(int j = 0; j<s[i].length; j++)
			{
				System.out.print(s[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
