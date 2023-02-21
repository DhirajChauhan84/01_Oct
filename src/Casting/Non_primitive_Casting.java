package Casting;

public class Non_primitive_Casting 
{
	/*	2.Non-primitive Casting
	 * 	Non_primitive casting is converting one type of class into another type
	 * 
	 *  there are 2 type in Non-primitive Casting
	 *  
	 *  1.Up casting
	 *  2.Down casting
	 */
	
	/*	1. Up Casting
	 * 		
	 * 	Assigning subclass property into superclass is called as Up casting
	 * 
	 * 	For up casting we have to perform inheritance first
	 * 
	 * 	we can declare other properties in sub class
	 * 
	 * 	the new property declared in sub class is not allowed to up cast
	 * 
	 * 	up casting allows only inherited properties from super class
	 */
	
	public static void main(String[] args) 
	{
		//crating object of son
		
		Son ob1 = new Son();				//Son is reference
		
		ob1.bike();
		
		ob1.car();
		
		ob1.mobile();
		
		ob1.money();
		
		ob1.home();
		
		
		System.out.println("----------------------------------------------------");
		
		
		//Creating object of son
		Father ob = new Son();			//Father is reference 
		
		ob.home();
		
		ob.car();
		
		ob.money();
		
	}

}
