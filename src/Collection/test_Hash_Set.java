package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class test_Hash_Set 
{
				//Inherited from Set interface
	
	/* 		- Doesn't allow duplicate values 
			- Allow only 1 null value. 
			- Order of insertion-random insertion 
			- No default capacity 
			- Data Structure : Hash table 
			- Storage type: hash table --That means values are stored as in the form of keys and values
			
			Methods of HashSet
			1.add();
			2.isEmpty();
			3.size();
			4.remove();
			5.contains();
			
			- We can use iterator cursor only
		
		When we use HashSet?
		 Ans- To remove duplicate elements when order of insertion is not mandatory
	 */

		public static void main(String[] args) 
		{
			HashSet hs = new HashSet();
			
			//to add
			hs.add("Dhiraj");
			
			hs.add(312);
			
			hs.add("Dhiraj");
			
			hs.add(101);
			
			hs.add(312);
			
			hs.add(null);
			
			System.out.println(hs);
			
			//size
			System.out.println(hs.size());
			
			//is Empty
			System.out.println(hs.isEmpty());
			
			//to add value
			hs.add('A');				//it will add value randomly
			System.out.println(hs);
			
			//remove
			hs.remove('A');
			System.out.println(hs);
			
			//contains
			System.out.println(hs.contains("Dhiraj"));
			
			System.out.println("---------By for each- --------------");
			
			for(Object o : hs)
			{
				System.out.println(o);
			}
			
			System.out.println("-------by iterator cursor-------------");
			
			Iterator itr = hs.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("_--------------------------------------------------------------------------------_");
		}
}
