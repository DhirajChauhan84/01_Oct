package String_for_mock;

public class String_ 
{
	/*	String is a non-primitive data type where size is not fixed
	 * 
	 * 	String Class is present in Java.lang package
	 * 	We can create an object of String class by 2 ways
	 * 	1.Without new keyword 
	 * 	2.with new keyword
	 * 
	 * Object of String class are stored in String pool area in heap memory
	 * 
	 * String pool area is classified into 2 parts
	 * 1.constant pool area
	 * 2.non-constant pool area
	 * 
	 * 	String class is a final class 
	 * 
	 */
	public static void main(String[] args) 
	{
		//Without new keyword
		
		/*	Objects of String class created without new keyword are stored in 
		 * 	constant pool area in String pool area in heap memory
		 * 	duplicate objects are not allowed 
		 * 	if we create duplicate object then that one duplicate value pointed to all duplicate objects
		 * 
		 */
		
		// Creating an objects of String class without new keyword
		
		String d = "Aishwarya";
		
		String d1 = "Dhiraj";
		
		String d2 = "Aishwarya";
		
		String d3 = "Dhiraj";
		
		System.out.println(d+" "+d1+" "+d2+" "+d3);
		
		
		//With new keyword
		
		/*	Objects created with new keyword are stored in non-constant pool area
		 * 	in String pool area in heap memory
		 * 	duplicate objects are allowed
		 */
		
		//Creating an objects of String class with new keyword
		
		String D = new String("Dhiraj");
		
		String D1 = new String("Aishwarya");
		
		String D2 = new String("Dhiraj");
		
		String D3 = new String("Aishwarya");
		
		System.out.println(D+" "+D1+" "+D2+" "+D3);
		
		
		
	}

}
