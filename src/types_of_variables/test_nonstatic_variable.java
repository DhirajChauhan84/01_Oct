package types_of_variables;

public class test_nonstatic_variable 
{
	// call the non-static variable from same class
	
	int a = 45;           //non-static global variable
	
	public static void main(String[] args) 
	{
		//creating object of same class
		
		test_nonstatic_variable tns1 = new test_nonstatic_variable();
		
		//calling nonstatic variable and printing it
		System.out.println(tns1.a);
		
	}

}
