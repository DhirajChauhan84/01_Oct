package Casting_for_mock;

public class casting 
{
	//Converting one data type info into another data type info is called as casting
	 
	/*	There are 2 types of Casting 
	 * 	1. Primitive Casting
	 * 	2. Non-primitive Casting 
	 */

	/*	1. Primitive Casting
	 * 	
	 * In primitive casting there are 3 types
	 * 
	 * 1.Implicit casting
	 * 2.Explicit casting
	 * 3.Boolean Casting
	 */
	
	
	 /* 	1. Implicit Casting
	  * 
	  * Converting Lower data type info into Higher data type info 
	  * also called as Widening casting
	  * 
	  * 
	 */	
	public static void main(String[] args) 
	{
		//lower data type
		int a = 100;					//int  = 4 byte				
		
		System.out.println(a);
		
		
		//Higher data type
		double b = a;					//double = 8 byte
		
		System.out.println(b);

	}
}
