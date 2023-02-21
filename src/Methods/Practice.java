package Methods;

public class Practice 
{           //Static method
	public static void info_gathering()
	{
		System.out.println("BA will prepare BRS document");
	}
	
	public static void analysis()
	{
		System.out.println("BA will prepare SRS document");
		
	}
	
	public static void design()
	{
		System.out.println("Designer will perform design on HLD and LLD");
		
	}
	
	public static void coding()
	{
		System.out.println("Developer will perform coding on LLD");
		
	}
	
	public static void testing()
	{
		System.out.println("Tester will test the application");
		
	}
	
	public static void maintenance()
	{
		System.out.println("Company have to provide Technical and Non-Technical support");
	}
	
	public static void main(String[]args)
	{
		info_gathering();
		analysis();
		design();
		coding();
		testing();
		maintenance();
		
	}

}
