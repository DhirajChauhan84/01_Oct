package String;

public class test3 
{
	// Difference between == and .equals();
	
	public static void main(String[] args) 
	{
		//Object creating without new keyword
		String s = "ABC";
		
		String s1 = "ABC";
		
		String s2 = "abc";
		
		System.out.println(s==s1); 				// == Operator used for reference comparison 
		
		System.out.println(s==s2);
		
		System.out.println(s.equals(s1));		//.equals() used for content comparison
		
		System.out.println(s.equals(s2));
		
		System.out.println("-------------------------------");
		
		
		//Creating object with new keyword
		
		String s3 = new String("XYZ");
		
		String s4 = new String("XYZ");
		
		String s5 = new String("xyz");
		
		System.out.println(s3==s4);
		
		System.out.println(s3==s5);
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.equals(s5));
	}

}
