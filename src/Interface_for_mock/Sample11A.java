package Interface_for_mock;

public interface Sample11A 
{
	//Overriding default same names method in interface
	
	default int add()
	{
		int a,b,c;
		
		a = 1;
		
		b = 2;
	
		c = a + b;
		
		return c;
	}

}
