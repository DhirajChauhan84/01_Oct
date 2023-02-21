package Interface_for_mock;

public interface Sample3 
{
	void num();			//By default---> public abstract void num();
	
	void pyramid();		//By default---> public abstract void pyramid();
	
	
	default void dot()
	{						//default complete method supports interface from 1.8V onwards
		System.out.println("***********************************");
	}

}
