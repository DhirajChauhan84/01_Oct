package This_and_Super_keyword;

public class test 
{
	int a = 20 ;				//non-static global variable
	
	
	public void m1()			//non-static method
	{
		int a = 10 ;			//local variable
		
		System.out.println("The value of local variable :"+a);
		
		System.out.println("The value of global variable from same class :"+this.a);	 //this keyword use to access global variable of same class
	}
	
	public static void main(String[] args) 
	{
		test t = new test();	//creating an object

		t.m1();					//calling the method
	}

}
