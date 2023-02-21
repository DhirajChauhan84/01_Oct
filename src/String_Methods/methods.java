package String_Methods;

public class methods 
{
	public static void main(String[] args) 
	{
		String s = "Dhiraj";
		String s1 = "Rajput";
		String s2 = "raj";
		String s3 = "";
		String s4 = "Dhiraj";
		String s5 = "dhiraj";
		String s6 = "dadadadad";
		String s7 = "Dhiraj Chauhan";
		
				
		
		
		//to verify object is empty or not 
		System.out.println(s.isEmpty());				//return boolean value
		
		//to get the size of object
		System.out.println(s.length()); 				//return int value
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		//to convert UpperCase
		System.out.println(s.toUpperCase());
		
		//to convert lower case
		System.out.println(s.toLowerCase());
		
		// to compare 2 objects
		System.out.println(s.equals(s5)); 	
		System.out.println(s.equals(s4));
		
		System.out.println(s.equalsIgnoreCase(s5));
		
		//to contains 
		
		System.out.println(s.contains(s2));
		
		//to get single char
		System.out.println(s.charAt(4));
		
		//to starts with 
		System.out.println(s.startsWith("A"));
		
		//to ends with
		System.out.println(s.endsWith("j"));
		
		//to get index no 
		System.out.println(s.indexOf("r"));
		
		//to get last index of char
		System.out.println(s6.lastIndexOf("a"));
		
		//to get substring
		System.out.println(s.substring(3, 5));
		
		//to concat 2 object
		System.out.println(s+s1);
		//OR
		System.out.println(s.concat(s1));
		
		//to replace
		System.out.println(s7.replace("Chauhan","Rajput"));
	}

}
