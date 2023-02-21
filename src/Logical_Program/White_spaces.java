package Logical_Program;

public class White_spaces 
{
	//Tell me the count of spaces 
	
	public static void main(String[] args) 
	{
		String orignal = "Dh i ra  j";
		
		int count = 0;
		
		for(int i = 0; i<orignal.length(); i++)
		{
			char c = orignal.charAt(i);
			
			if(c ==' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
