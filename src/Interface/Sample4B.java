package Interface;

public interface Sample4B 
{
	void talk();		//public abstract void talk(); By default
	
	void sleep();		//public abstract void sleep();By default
	
	default void m2()
	{							//default void m2() complete method
		System.out.println("i am m2 ");
	}

}
