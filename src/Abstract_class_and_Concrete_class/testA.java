package Abstract_class_and_Concrete_class;

public class testA extends test
{
	
	public void m1()
	{
		System.out.println("i am abstract method from test class");
	}
	
	public void m3()
	{
		System.out.println("i am abstract method m3 from test class");
	}
	
	public static void main(String[] args) 
	{
		
		testA ob = new testA();
		
		ob.m1();
		
		ob.m2();
		
		ob.m3();
	}

}
