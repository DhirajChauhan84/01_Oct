package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class test_Linked_HashSet 
{
		public static void main(String[] args) 
		{
				//Linked_HashSet
			/*
			 * 	it is a implementation class of Set interface
			 * 	duplicates are not allowed
			 * 	only one null value allow
			 * 	insertion order is maintained 
			 * 	no default capacity 
			 * 	store value as hash table --- in the form of key and value
			 * 
			 * 	In LinkedHashSet we can use only Iterator cursor only
			 * 
			 * Methods in LinkedHashSet
			 * 1.add();
			 * 2.isEmpty();
			 * 3.size();
			 * 4.contains();
			 * 5.remove();
			 * 
			 * 	when we use Linked_HashSet?
			 * 	Ans- to remove duplicates and order of insertion is mandatory
			 */
			
			//creating LinkedHashSet object
			LinkedHashSet lh = new LinkedHashSet();
			
			lh.add("Dhiraj");
			
			lh.add("Rajput");
			
			lh.add(101);
			
			lh.add(12.12);
			
			lh.add(101);
			
			System.out.println(lh);
			
			//to verify object is empty or not
			System.out.println(lh.isEmpty());	//returns boolean value
			
			//to check size of the object
			System.out.println(lh.size());		//return integer value
			
			//to verify given value is present in object or not
			System.out.println(lh.contains(101));		//returns boolean value
			
			//to remove value from object
			lh.remove(12.12);
			System.out.println(lh);
			
			System.out.println("---------By for each-----------");
			
			for(Object o : lh)
			{
				System.out.println(o);
			}
			
			System.out.println("-----------by Iterator Cursor-----------");
			
			Iterator itr = lh.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}

}
