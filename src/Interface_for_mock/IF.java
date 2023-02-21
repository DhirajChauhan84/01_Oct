package Interface_for_mock;

public class IF 
{
	public static void main(String[] args) 
	{
		IF ob = new IF();
		
		ob.m1();
	}
	
	void m1()
	{
		int age = 18;
		
		if(age==18)
		{
			System.out.println("Young");
		}
		else if(age<18)
		{
			System.out.println("Child");
		}
		else
		{
			System.out.println("Mhatara");
		}
	}

}
