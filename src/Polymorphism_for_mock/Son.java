package Polymorphism_for_mock;

public class Son extends Father
{
	//Run time polymorphism
	
	/*declaration binded with defination at runtime based on object creation is known 
	 * as run time polymorphism / dyanamic biding / 
	 *
	 * 
	 */
	public void m1()
	{
		System.out.println("Hlw");
	}
	
	public static void main(String[] args) 
	{
		Father ob = new Son();
		
		ob.m1();				//Dyanamic Biding
		
		Father a = new Father();
		
		a.m1();
		
		
	}

}
