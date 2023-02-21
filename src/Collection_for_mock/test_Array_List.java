package Collection_for_mock;

import java.util.ArrayList;

public class test_Array_List 
{
	public static void main(String[] args) 
	{
			ArrayList ar = new ArrayList();
			
			//to add the data in ArrayList
			ar.add("Dhiraj Rajput");
			
			ar.add("Quality Analyst");
			
			ar.add('A');
			
			ar.add(1.5);
			
			ar.add(45000);
			
			// to print use for each loop
			for(Object a : ar)
			{
				System.out.println(a);
			}
			
			System.out.println("-------------------------------------");
			
			//to check ArrayList is empty or not
			System.out.println(ar.isEmpty());
			
			//to check size 
			System.out.println(ar.size());
			
			//to update data
			ar.set(1, "Software Tester");
			System.out.println(ar);
			
			//to add value at index 1
			ar.add(1,"Pune");		// right shift operation
			System.out.println(ar);
			
			//to remove the data
			ar.remove(1.5);
			System.out.println(ar);
			
			//to find index of data
			System.out.println(ar.indexOf(45000));
			
			//to find value at index 3
			System.out.println(ar.get(3));
			
			//to check ArrayList contains Dhiraj or not
			System.out.println(ar.contains("Dhiraj Rajput"));
			
		
	}

}
