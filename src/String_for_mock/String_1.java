package String_for_mock;

public class String_1 
{
	//What is String immutable in nature ? And Why?
	
	/*	1.Once we initialized the value of the String object then we can not
	 * 	change it
	 * 
	 * 	if we want to change the value of it then we have to create new object
	 * 
	 * 	And if there is a duplicate objects in String class then that one duplicate value
	 * 	is pointed to all duplicate objects and if we change the value then value will be changed for
	 * 	all duplicate objects 
	 * 
	 * 	2.String class is a final class and if we create an object of final class then that
	 * 	object will be final so we can not change the value of final object
	 */
	public static void main(String[] args)
	{
		String s = new String("Dhiraj");
		
		System.out.println(s);
		
		String s1 =	s.concat("Rajput");			//New object created for changing value
		
		System.out.println(s1);
		
	}

}
