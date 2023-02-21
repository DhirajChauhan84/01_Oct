package types_of_variables_mock;

public class task_nonstatic_variable 
{
	/*write main method in one class and 
	initialize non-static global varable in 2nd class
	now call the non-static variable in main method*/
	
	public static void main(String[] args) 
	{
		tak_nonstativ_variable_B ob = new tak_nonstativ_variable_B();
		
		System.out.println(ob.a);
	}

}
