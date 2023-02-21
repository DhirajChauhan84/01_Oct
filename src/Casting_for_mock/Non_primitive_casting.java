package Casting_for_mock;

public class Non_primitive_casting 
{
	/*	2. Non-primitive Casting
	 * 		converting one type of class into another type is called as non-primitive Casting
	 * 
	 * 		there are 2 type
	 * 
	 * 		1.Up Casting
	 *		2.Down Casting 
	 */

	/*	1. Up Casting
	 * 		Assigning subclass property into superclass is called as Up Casting
	 * 		
	 * 		we have perform inheritance 1st
	 * 		we can declare new properties in sub class
	 * 		Up casting allows only those properties which are present in super class
	 * 		up casting not allows to new properties which are in sub class
	 */
	
	public static void main(String[] args) 
	{
		//Creating object of Son
		
		Son s = new Son();
		
		s.bike();
		
		s.car();
		
		s.home();
		
		s.mobile();
		
		System.out.println("............................");
		
		//creating object of Son with reference of Father
		
		Father f = new Son();
		
		f.car();
		
		f.home();
		
	}
}
