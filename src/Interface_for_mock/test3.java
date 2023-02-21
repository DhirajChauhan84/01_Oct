package Interface_for_mock;

public class test3 implements Sample3
{
	//Implementation Class
	
	public void num()
	{									//Method definition 
		for(int i = 0; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	public void pyramid()
	{									//Method definition
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1; j<=i; j++)
			{	
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		//Creating an object 
		
		test3 t4 = new test3();
		
		t4.num();
		
		t4.dot();
		
		t4.pyramid();
		
	}

}
