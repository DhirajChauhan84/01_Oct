package This_and_Super_keyword;

public class test4 extends test3			//sub class of test3
{
	int a = 1;						//non-static global variable
	
	
	public static void main(String[] args) 
	{
		
		test4 t4 = new test4();			//creating an object
		
		t4.m3();						//calling method
				
	}
	
	public void m3()					//non-static method
	{
		int a = 2;							//local variable
		
		System.out.println("The value of local variable :"+a);	
		
		System.out.println("The value of global variable from same class :"+this.a);		//this keyword is used to access global variable from same class
		
		System.out.println("The value of global variable from parent class :"+super.a);	//super keyword is used to access global variable from parent class
		
		System.out.println("The value of global variable from parent class :"+super.name);
	}
	

}
