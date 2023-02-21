package String_Methods_for_mock;

public class test 
{
	public static void main(String[] args) 
	{
		String s = "Dhiraj";
		String s1 = "aj";
		String s2 = "dhiraj";
		
		
		
		
		
		
		
		//how to check the given s object is empty or not
		System.out.println(s.isEmpty());
		System.out.println("---------------------------------");
		
		//find the size of the s object
		System.out.println(s.length());
		System.out.println("---------------------------------");
		
		//find the index no of i in s object
		System.out.println(s.indexOf('i'));
		System.out.println("---------------------------------");
		
		//check the s object is starts with the D or not
		System.out.println(s.startsWith("D"));
		System.out.println("---------------------------------");
		
		//check the s object ends with the j or not
		System.out.println(s.endsWith("j"));
		System.out.println("---------------------------------");
		
		//check the object s is contains object s1 or not
		System.out.println(s.contains(s1));
		System.out.println("---------------------------------");		
		
		//check the object s1 is contains object s or not
		System.out.println(s1.contains(s));
		System.out.println("---------------------------------");
		
		//how to convert object s in upper case
		System.out.println(s.toUpperCase());
		System.out.println("---------------------------------");
		
		//how to convert object s in lower case
		System.out.println(s.toLowerCase());
		System.out.println("---------------------------------");
		
		// how to check object s and s2 both are as it is
		System.out.println(s.equals(s2));
		System.out.println("---------------------------------");
		
		//how to check object s and s2 both are same
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println("---------------------------------");
		
		//how to check last index of a of object s3
		System.out.println(s.lastIndexOf('a'));
		System.out.println("---------------------------------");
		
		//how to get substring between index 1 to 4 of object s
		System.out.println(s.substring(1,4));
		System.out.println("---------------------------------");
		
		//how to check substring from 3
		System.out.println(s.substring(3));
		System.out.println("---------------------------------");
		
		//how to add Rajput in object s
		System.out.println(s.concat("Rajput"));
		System.out.println("---------------------------------");
		
		//how to add object s1 in object s
		System.out.println(s.concat(s1));
		System.out.println("---------------------------------");
		
		//how to replace Dhiraj to Dhiru in object s
		System.out.println(s.replace("Dhiraj", "Dhiru"));
		System.out.println("---------------------------------");		
		
	}

}
