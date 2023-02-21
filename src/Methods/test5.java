package Methods;

public class test5 
{
	//non-static method from different class
	
	public static void main(String[]args)
	{
		System.out.println("hi...i am from main method");
		
		//step1-create object
		
		test6 t  =new test6();
		
		//step 2 - call the method
		
		t.m1();
		
		t.m2();
		
		t.m3();
		
		t.m4();
		
		t.m5();
	}

}
