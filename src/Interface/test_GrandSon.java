package Interface;

public class test_GrandSon implements Sample_Son
{

	public void m1()
	{
		System.out.println("hlw...");
	}
	
	public void m2()
	{
		System.out.println("Hi..");
	}
	
	public static void main(String[] args) 
	{
		test_GrandSon tg = new test_GrandSon();
		
		tg.m1();
		
		tg.m2();
		
		
	}
	

}
