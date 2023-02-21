package Interface_for_mock;

public class test_GrandSon implements Sample_Son
{
	public void hair()
	{
		System.out.println("Shinny brown");
	}
	
	public void eye()
	{
		System.out.println("Bluish");
	}
	
	public void nose()
	{
		System.out.println("Straight");
	}
	
	public void skintone()
	{
		System.out.println("White");
	}
	
	public static void main(String[] args) 
	{
		test_GrandSon tg = new test_GrandSon();
		
		tg.hair();
		
		tg.eye();
		
		tg.nose();
		
		tg.skintone();
		
		
	}

}
