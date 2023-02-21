package Methods;

public class test9 
{
	public static void addition()         //---->without parameter method
	{
		int a = 10;
		int b = 40;
		int ans = a+b;
		System.out.println("The sum of 10 & 40 is "+ans);
	}
	
	public static void addition(int c, int  d)     //--------->with parameter method
	{
		int ans = c + d;
		System.out.println("The sum of 20 & 50 is "+ans);
	}
	
	public static void main(String[]args)
	{
		addition();
		addition(20,50);
	}
	
	

}
