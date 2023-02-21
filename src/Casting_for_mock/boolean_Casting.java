package Casting_for_mock;

public class boolean_Casting 
{
	/*	3.Boolean Casting
	 * 		in boolean casting the data is predefined
	 * 		it is considered as incompatible casting
	 */
	
	public static void main(String[] args) 
	{
		boolean a = true;				//boolean = 2 byte
		
		System.out.println("data in boolean : "+ a);
		
		
		int b = (a)? 0 : 1 ;
		
		System.out.println("data in int :"+ b );
		
	}

}
