package Interface_for_mock;

public interface Sample11B 
{
	default int add()
	{
		int a,b,c;
		
		a = 10;
		
		b = 20;
		
		c = a + b;
		
		return c;	
	}

}
