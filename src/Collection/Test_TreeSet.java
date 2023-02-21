package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Test_TreeSet 
{	
				//TreeSet
		/*
		 *  TreeSet is implementation class of Set interface
		 *  we can store only same type of data
		 *  duplicates are not allowed
		 *  null values are not allowed
		 *  order of insertion is in ascending 
		 *  Data Structure is Balanced tree
		 *  Stores data in hash table--- like key value form
		 *  
		 *  we can use only Iterator cursor
		 *  
		 *  Methods of TreeSet
		 *  1.add();
		 *  2.remove();
		 *  3.isEmpty();
		 *  4.size();
		 *  5.contains();
		 *  6.first();
		 *  7.last();
		 *  8.pollFirst();
		 *  9.pollLast();
		 *  
		 *  When we can use TreeSet?
		 *  Ans- When we want to remove duplicates and insertion order in ascending
		 */
		public static void main(String[] args) 
		{	
				TreeSet ts = new TreeSet();
				
				//to add values in object
				ts.add(10);
				
				ts.add(11);
				
				ts.add(1);
				
				ts.add(4);
				
				ts.add(1);
				
				ts.add(13);
				
				ts.add(65);
				
				ts.add(19);
								
				//ts.add(null);
				
			
			System.out.println(ts);
			
			//to verify object is empty or not
			System.out.println(ts.isEmpty());		//returns boolean value
			
			//to find size of the object 
			System.out.println(ts.size());			//returns integer value
			
			//to verify object contains 10 or not
			System.out.println(ts.contains(10));	//returns boolean value
			
			//to remove the value from object
			ts.remove(1);
			System.out.println(ts);
			
			//to get first value in object
			System.out.println(ts.first());
			
			//to get last value in object 
			System.out.println(ts.last());
			
			//to remove first value in object
			ts.pollFirst();
			System.out.println(ts);
			
			//to remove last value in object
			ts.pollLast();
			System.out.println(ts);
			
			System.out.println("-------------for each loop-----------------");
			
			for(Object o : ts)
			{
				System.out.println(o);
			}
			
			System.out.println("------------By Iterator cursor-------------");
			
			Iterator itr = ts.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}

}
