package Interface_for_mock;

public interface Sample5A 
{
	String a = "Info";		//By default public static final String a = "Info";
	
	String name();		//By default public abstract String name();
	
	String company();	//By default public abstract String company();

	String city();		//By default public abstract String city();
	
	default void line()
	{
		System.out.println("------------------------------------------");
	}
	
}
