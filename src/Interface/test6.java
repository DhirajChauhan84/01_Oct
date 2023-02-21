package Interface;

public class test6 implements Sample6A,Sample6B
{
	public void m1()
	{
		System.out.println("Hi.. i am m1() from implemented class");
		
		Sample6A.super.m1();		//If we use this in method definition then we will complete m1() from Sample6A
		
		Sample6B.super.m1();		//If we use this in method definition then we will complete m1() from Sample6B
	}

	public static void main(String[] args) 
	{
		test6 t6 = new test6();
		
		t6.m1();
		
	}
}
