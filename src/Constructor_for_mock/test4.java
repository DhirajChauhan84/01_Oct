package Constructor_for_mock;

public class test4 
{
	String name ;
	
	int id ;
	
	String city ;
	
	String role ;
	
	test4()
	{
		
	}
	
	test4(String n)
	{
		this.name = n ;
		
		System.out.println(n);
	}
	
	test4(String name, int ID)
	{
		this();
		this.id = ID ;
		
		System.out.println(ID);
		
	}
	
	test4(String name, int ID, String city)
	{
		this();
		
		this.city = city ;
		
		System.out.println(city);
	}
	
	test4(String name,int ID,String city,String role)
	{
		this();
				
		this.role = role ;
		
		System.out.println(role);
		
	}
	
	public static void main(String[] args) 
	{
		test4 a = new test4();
		
		test4 a1 = new test4("Aishwarya");
		
		test4 a2 = new test4("Aishwarya",101);
		
		test4 a3 = new test4("Aishwarya",101,"Pune");
		
		test4 a4 = new test4("Aishwarya",101,"Pune","Payroll Senior Associate");
		
		
	}

}
