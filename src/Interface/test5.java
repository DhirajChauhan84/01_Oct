package Interface;

public class test5 implements Sample5
{
	//implementation Class
	
	public void m1()
	{								
		System.out.println("Hi.. i am m1 in implemented class");
	}
	
	public void m2()
	{
		System.out.println("Hi.. i am m2 in implemented class");
	}
	
	public void m3()
	{
		System.out.println("Hi.. i am m3 in implemented class");
	}
	
	
	//override m4()
	public void m4()
	{
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		
		test5 t5 = new test5();
		
		t5.m1();
		
		t5.m2();
		
		t5.m3();
		
		t5.m4();
		
	}

	

}
