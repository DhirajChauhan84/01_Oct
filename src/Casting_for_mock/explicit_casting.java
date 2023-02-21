package Casting_for_mock;

public class explicit_casting 
{
	/* 2. Explicit Casting
	 * 		means converting Higher data type info into Lower data type info
	 * 		also called as Narrowing Casting	
	 * 		Data loose comes here
	 */
	public static void main(String[] args) 
	{
		
		double a = 100.9;			//double = 8 byte
		
		System.out.println("The higher data is :"+a);

		int b = (int)a ;			//int = 4 byte
		
		System.out.println("Lower data is : "+ b);
		
		
	}

}
