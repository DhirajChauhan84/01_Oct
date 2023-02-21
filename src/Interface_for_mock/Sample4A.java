package Interface_for_mock;

public interface Sample4A 
{
	public void name();		//By default public abstract void name();
	
	void surname();			//By default public abstract void surname();
	
	default void d()
	{
		System.out.println("........................");
	}

}
