package types_of_variables_mock;

public class task_types_of_variable_with_loop_nonstatic 
{
	/*task for variables and do while loop to print table of 134

	create a class and create non-static global variable for starting condition

	create a new class and write a main method and write do while loop*/
	
	public static void main(String[] args) 
	{
		task_types_of_variable_with_loop_nonstaticB ob = new task_types_of_variable_with_loop_nonstaticB();
		
		do
		{
			System.out.println(ob.a);
			
			ob.a = ob.a+134;
		}
		while(ob.a<=1340);
		
	}

}
