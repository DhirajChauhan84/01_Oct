
public class demo 
{
	public static void main(String[] args) 
	{
		demo t1 = new demo();
		
		t1.m2();
		
	}
	
	public static void main(int[]args)
	{
		String a = "Dhiraj";
		
		System.out.println(a);
	}
	public void m1()
	{
		System.out.println("hi");
		
	}
	public void m2()
	{
		System.out.println("hlw");
		m1();
	}

}
