package Polymorphism;

public class test_method_overriding 
{
	/*acquiring the method from super class into sub class
	 * but changing the method implementation/defination is called as 
	 * Method Overriding
	 *Also called as Run time polymorphism / late biding / dyanamic biding
	 */
	public static void main(String[] args) 
	{
		Son s = new Son();
		
		s.money();
		
		s.house();
		
		s.gold();
		
		s.car();
		
		s.property();
		
		System.out.println(s.a);
		
		System.out.println("--------------------------------------------------------------");
		
		
		Father f = new Father();
		
		f.money();
		
		f.house();
		
		f.gold();
		
		f.car();
		
		f.property();
		
		System.out.println(f.a);
		
		
	}
	

}
