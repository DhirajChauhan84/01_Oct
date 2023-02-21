package Collection;

import java.util.ArrayList;

public class Test_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Dhiraj");
		
		al.add("Software Tester");
		
		al.add(8600412337L);
		
		al.add("Dhiraj");
		
		al.add('A');
		
		System.out.println(al);
	
		System.out.println(al.indexOf("Dhiraj"));
	}

}
