package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test_ArrayList2 
{
			//ArrayList
	
		/*	it is a implementation class of List interface
		 *  duplicates are allowed in ArrayList
		 * 	allow null values
		 * 	order of insertion maintained 
		 * 	default capacity of ArrayList is 10
		 * 	Incremental capacity = (current capacity*3/2)+1
		 * 	Data structure is Resizable
		 * 	store data in index
		 * 
		 * 	we can use Iterator and ListIterator cursor
		 * 
		 * 	Methods in ArrayList
		 * 	1.add();
		 * 	2.isEmpty();
		 * 	3.size();
		 * 	4.contains();
		 * 	5.indexOf();
		 * 	6.get();
		 * 	7.remove();
		 * 	8.set();
		 */
	public static void main(String[] args) 
	{
			ArrayList a = new ArrayList();
			
			 
			//to add value in ArrayList
			a.add("Dhiraj");
			
			a.add(101);
			
			a.add(12.21);
			
			a.add('A');
			
			System.out.println(a);
			
			//to check object is empty or not
			System.out.println(a.isEmpty());
			
			//to check size
			System.out.println(a.size());
			
			//to check a contains 12.21
			System.out.println(a.contains(12.21));
			
			//to check index of 12.21
			System.out.println(a.indexOf(12.21));
			
			//to check value at 0 index
			System.out.println(a.get(0));
			
			//to add value at index 1
			a.add(0,"Rajput");			//right shift operation
			System.out.println(a);
			
			//to remove value
			a.remove(0);				//left shift operation
			System.out.println(a);
			
			//to update
			a.set(0,"Dhiru");
			System.out.println(a);
			
			
			System.out.println("------------printing by for each loop-------------");
			
			for(Object d : a)
			{
				System.out.println(d);
				
			}
			
			System.out.println("By Iterator Cursor");
			
			Iterator itr = a.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("By ListIterator cursor");
			
			ListIterator litr = a.listIterator();
			
			
			while(litr.hasNext())
			{
				System.out.println(litr.next());
			}		
			
		
	}

}
