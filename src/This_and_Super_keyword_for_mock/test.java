package This_and_Super_keyword_for_mock;

public class test extends test2
{
	String name = "Payal";					//non-static global variable
	
	//String name = "Sushant";
	
	
	void m1()
	{
		String name = "Sonali";				//local variable
		
		System.out.println(name);
		
		System.out.println(this.name);		//this keyword is used to access global variable from same class
		
		System.out.println(super.name);		//super keyword is used to access global variable from parent class
			
		
	}
	
	public static void main(String[] args) 
	{
		test ob = new test();
		
		ob.m1();
		
	}

}
