package AbstractClass_and_ConreteClass;

public class testA extends test
{
	public void m1()
	{
		System.out.println("m1 from child");
	}
	
	public void m2()
	{
		System.out.println("m2 from child");
	}
	
	public void m3()
	{
		System.out.println("m3 from child");
	}
	
	public static void main(String[] args) 
	{
		testA t = new testA();
		
		t.m1();
		t.m2();
		t.m3();
		
		t.m4();
		t.m5();
		t.m6();
		
	}

}
