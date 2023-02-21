package Interface;

public class test3 implements Sample3 		//Implementation Class
{
	public void hi()
	{
		System.out.println("Hi from implemetation class");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		test3 t3 = new test3();
		
		t3.hi();
		
		t3.m1();
	}
	

}
