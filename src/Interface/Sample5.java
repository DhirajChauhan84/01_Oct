package Interface;

public interface Sample5
{
	void m1();						//By default public abstract void m1();
	
	//from 1.8V changes
	
	public void m2();				//By default public abstract void m2();
	
	abstract void m3();				//By default public abstract void m3();
	
	public static void m4()
	{
		System.out.println("Hi... i am static m4 from interface Sample5");
	}
	
	/*public static void main(String[]args)
	{
		m4();
	}*/

}
