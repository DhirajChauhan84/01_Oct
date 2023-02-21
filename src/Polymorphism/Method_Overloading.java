package Polymorphism;

public class Method_Overloading 
{
	//Polymorphism performing single task in different ways
	//method m1 created with different different parameters
	
	/*Declaring multiple methods with same name but different parameter
	 * in the same class called as Method Overriding
	 * Also called as Compile time polymorphism / early biding / static biding
	 */
	
	public static String m1()
	{
		String i = "Dhiraj";
		
		return i;
		
	}
	
	public static void m1(int a)
	{
		System.out.println("Rahul");
		
		
	}
	
	public static float m1(int v,int t,int c)
	{
		
		float z = 2f;
		
		return z;
				
	}
	
	public static void main(String[] args) 
	{
		System.out.println(m1());
		
		m1(1);
		
		System.out.println(m1(1,2,3));
		
		
		
		
	}

}
