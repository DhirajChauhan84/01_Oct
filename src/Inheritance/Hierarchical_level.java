package Inheritance;

public class Hierarchical_level 
{
	public static void main(String[] args) 
	{
		//creating an object
		
		Test2_son s1 = new Test2_son();
		
		s1.mobile();
		
		s1.property();
		
		test2_son2 s2 = new test2_son2();
		
		s2.bike();
		
		s1.property();
		
		test2_son3 s3 = new test2_son3();
		
		s3.laptop();
		
		s1.property();
	}

}
