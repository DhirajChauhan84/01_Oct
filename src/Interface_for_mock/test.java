package Interface_for_mock;

public class test implements Sample
{
	//Implementation Class
	
	/*Implementation class used to provide defination of all the abstract/incomplete methods
	 * of interface with the help of implements keyword
	 */
	
	public void m1()
	{
		//method defination
		
		System.out.println("Hi... i am m1 from implementation class");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		
		test t = new test();
		
		t.m1();
		
	}
	

}
