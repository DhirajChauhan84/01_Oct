package String;

import java.lang.String;

public class test2 
{
	/*	String is immutable means what? And Why?
	 * 
	 * 		1.Once we initialized the value of String object then we can not
	 *  	change it if we want to modify the value of that object then we have to 
	 *  	create new object
	 *  
	 *  	And if there is a duplicate objects in string class then that one duplicate value 
	 * 		is pointed to all duplicate object and if we change the value then the value will change 
	 * 		for all duplicate objects
	 * 
	 * 		2.The String class is final and if we create an object of final class then that object will be
	 * 		final thats why we can't change the value in String
	 * 		And thats why the String is immutable
	 * 
	 */
	public static void main(String[] args) 
	{
		//For Non-constant pool area
		
		String s = new String("Dhiraj");
		
		System.out.println(s);
				
		s ="DhirajA";
		
		System.out.println(s);
		
		String ref = s.concat("Rajput");			//created new object for modify value
		
		
		System.out.println(ref);
		
		//For constant pool area
		
		String S = "Pune";
		
		String S1 = "Pune";
		
		String S2 = "Pune";
		
		
		
		System.out.println(S+S1+S2);
		
		 S2 = "Mumbai";		// If we change the one duplicate value then all values will be changed
		
		System.out.println(S+S1+S2);
	}

}
