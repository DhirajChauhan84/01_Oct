package Casting;

public class P_test3 
{
	/*	3. Boolean Casting
	 * 
	 * 		the boolean casting is considered as incompatible casting
	 * 		because boolean is unique data type where data type info is predefined
	 */
	
	public static void main(String[] args) 
	{
		boolean a = true;
		
		int b = (a)? 1 : 0 ;				//boolean = 2 byte
		
		System.out.println(b);
		
		
		boolean c = false;
		
		int d = (c)? 1 : 0 ;	
		
		System.out.println(d);
	}

}
