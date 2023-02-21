package Methods;

public class test2 
{    //Static method
	public static void run()
	{
		System.out.println("I am running");
	}
	
	public static void main(String[]args)
	{
		System.out.println("A");
		//run();
		
		test2.run();
		
		test2.eat();
		
	}
	
	public static void eat()
	{
		System.out.println("I am Eating");
	}

}
