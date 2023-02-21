package Interface;

public class test4 implements Sample4A,Sample4B		//implementation class
{
	public void eat()
	{
		System.out.println("Eating");		//method definition 
	}
	
	public void walk()
	{
		System.out.println("Walking");
	}
	
	public void talk()
	{
		System.out.println("Talking");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}

	public static void main(String[] args) 
	{
		
		test4 t4 = new test4();
		
		t4.eat();
		
		t4.walk();
		
		t4.talk();
		
		t4.sleep();
		
		t4.m1();
		
		t4.m2();		
		
	}
}
