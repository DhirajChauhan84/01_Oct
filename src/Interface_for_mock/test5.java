package Interface_for_mock;

public class test5 implements Sample5A , Sample5B
{
	public static void main(String[] args) 
	{
		System.out.println(a);			//calling variable which is in interface Sample5A
		
		test5 t5 = new test5();
		
		t5.line();
		
		System.out.println(t5.name());
		
		System.out.println(t5.company());
		
		System.out.println(t5.role());
		
		System.out.println(t5.sal());
		
		System.out.println(t5.city());
		
		t5.line();
		
		
	}
	
	public String name()
	{							//Method definition
		return"Dhiraj Rajput";
		
	}
	
	public String company()
	{							//Method definition
		return"Velocity";
	}
	
	public String role()
	{							//Method definition
		return"Quality Analyst";
	}
	
	public String city()
	{							//Method definition
		return"Pune";
	}
	
	public int sal()
	{							//Method definition
		return 50000;
	}

}
