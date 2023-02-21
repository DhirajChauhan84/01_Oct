package types_of_variables;

public class test_nonstatic_variable2 
{
	// call the non-static global variable from different class
	
	public static void main(String[] args) 
	{
		//creating object of that class in which nonstatic variable is present
		
		test_nonstatic_variable2b ob = new test_nonstatic_variable2b();
		
		//calling the nonstatic variable and printng it
		
		System.out.println(ob.a);
		
		
	}

}
