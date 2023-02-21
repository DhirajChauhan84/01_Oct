package String;

public class Test 
{
	public static void main(String[] args) 
	{
		/*	String is a non-primitive data type where memory size is no fixed
		 * 	String class is present in java.lang package
		 * 	
		 * 	Object creation can be done by 2 ways
		 * 	1. With using new keyword
		 * 	2.Without using new keyword
		 * 
		 * 	when we create object of String class then it stored in String pool area in heap memory
		 * 	
		 * 	String pool area classified into
		 * 	1.Constant pool area
		 * 	2.Non-constant pool area
		 * 
		 * 	String Class is a final Class
		 */
		
		//String declaration with new keyword
		/*	When we create an object of string class with new keyword then it stored in
		 * 	non-constant String pool area in heap memory
		 * 	Duplicate objects are allowed in non-constant
		 */
		
		
		String s1 = new String("Dhiraj");
		
		String s2 = new String("Dhiraj");
		
		String s3 = new String("Dhiraj");	
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
				
		
		
		/*	String declaration without new keyword
		 * 	Objects created without new keyword stored in constant loop area
		 * 	in String pool area which is in heap memory
		 * 	
		 * 	Duplicate objects are not allowed in constant pool area
		 */
		
		
		String S1 = "Dhiraj";
		
		String S2 = "Dhiraj";
		
		String S3 = "Dhiraj";
		
		System.out.println(S1);
		
		System.out.println(S2);
		
		System.out.println(S3);
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
