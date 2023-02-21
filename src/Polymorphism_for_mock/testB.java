package Polymorphism_for_mock;

public class testB extends testA
{
	/*acquiring the method from super class into sub class
	 * but changing the method implementation/defination is called as 
	 * Method Overriding
	 *Also called as Run time polymorphism / late biding / dyanamic biding
	 */
	
	public int add()
	{
		int a = 1 ;
		
		int b = 2 ;
		
		int sum = a+b ;
		
		return sum ;
		
	}
	
	public static void main(String[] args) 
	{
		//creating an object this class
		
		testB ob = new testB();
		
		System.out.println(ob.add());
		
		//creating an object of parent class
		
		testA ob2 = new testA();
		
		System.out.println(ob2.add());
		
	}
	

}
