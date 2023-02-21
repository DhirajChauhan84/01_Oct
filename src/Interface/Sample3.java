package Interface;

public interface Sample3 		//Interface
{
	public void hi();		//this is public abstract void hi();By default
	
	
	
	/*from 1.8 V onwards we can use default complete method in interface
	 * so interface is not 100 % abstract now
	*/
	default void m1()		//this is default void m1() complete method
	{
		//method definition
		
		System.out.println("*****");
	}

}
