package Interface_for_mock;

public interface Sample10 
{
	//From 1.8 V we can write the static complete method in interface
	// We can also write the main method in interface but we can not create an object
	
	public static void m1()
	{
		System.out.println("Static m1()");
		
	}
	
	default void m2()
	{							//this is a complete method we don't need to complete it in implementation class
		System.out.println("Default m2()");
	}
	
	public static void main(String[] args) 
	{
		
		m1();
		
	}

}
