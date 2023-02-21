package Interface;

public interface Sample4A 
{
	void eat();		//public abstract void eat();By default
	
	void walk();	//public abstract void walk();By default
	
	default void m1()
	{							//default void m1() complete method
		System.out.println("i am m1");
	}

}
