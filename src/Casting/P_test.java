package Casting;

public class P_test 
{
	/* 2.Explicit Casting
	 * 
	 * 		Converting Higher data type of info into Lower data type info is called as Explicit Casting
	 * 		Also called as Narrowing Casting where memory goes on decreasing
	 * 		In Explicit Casting data loose takes place 
	 */
	
	public static void main(String[] args) 
	{
		//higher data type info
		
		double a = 20.2;			//double = 8 byte
		
		System.out.println(a);
		
		//Lower data type info
		
		int b = (int)a;					//int = 4 byte
		
		System.out.println(b);
	}

}
