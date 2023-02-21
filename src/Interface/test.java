package Interface;

public class test implements Sample
{
	//Implementation Class
	
	/*Implementation Class provides definition to all incomplete methods
	 * or abstract methods in interface with the help of implements keyword
	 */
	
	public  void m2()
	{
		System.out.println("I am m2 from implementation class");	//Method defination
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		
		test t = new test();
		
		t.m2();
		
	
	}
}
