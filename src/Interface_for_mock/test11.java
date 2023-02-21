package Interface_for_mock;

public class test11 implements Sample11A,Sample11B
{
	
	public int add()
	{
		return Sample11A.super.add();
		//return Sample11B.super.add();
	}
	
	public static void main(String[] args) 
	{
		test11 t11 = new test11();
		
		System.out.println("The addition of a and b is :"+" "+t11.add());
		
	}
	

}
