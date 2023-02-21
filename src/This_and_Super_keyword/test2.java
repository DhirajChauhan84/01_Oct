package This_and_Super_keyword;

public class test2 
{
	 String a = "Aishwarya";			//non-static global variable
	
	
	public void m2()					//non-static method
	{
		String a = "Dhiraj";			//local variable
		
		System.out.println("The value of local variable :"+a);
		
		System.out.println("The value of global variable from same class :"+this.a);		//this keyword use to access global variable of same class
		
	}
	
	public static void main(String[] args) 
	{
		test2 t2 = new test2();		//creating object
		
		t2.m2();					//calling method
		
	}

}
