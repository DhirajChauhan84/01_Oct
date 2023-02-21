package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class test_vector2 
{
			//Vector is legacy class and implementation class of List interface
	/*
	 * Duplicates are allowed
	 * allowed any null value
	 * order of insertion is maintained
	 * default capacity is 10
	 * incremental capacity is (Current capacity * 2)
	 * Data structure is Doubly
	 * Stores values in index format
	 * 
	 * We can use Iterator,ListIterator and Enumeration cursor 
	 * 
	 * Methods in Vector
	 * 1.add();
	 * 2.isEmpty();
	 * 3.size();
	 * 4.contains();
	 * 5.indexOf();
	 * 6.get();
	 * 7.set();
	 * 8.remove();
	 * 
	 * 
	 */
		public static void main(String[] args) 
		{
			Vector v = new Vector();
			
			v.add("Dhiraj");
			
			v.add(1000);
			
			v.add('A');
			
			v.add(1000);
			
			v.add("Dhiraj");
			
			System.out.println(v);
			
			//to check collection object is empty or not
			System.out.println(v.isEmpty());
			
			//to check size
			System.out.println(v.size());
			
			//to check index of A
			System.out.println(v.indexOf('A'));
			
			//to check object contains 1000 or not
			System.out.println(v.contains(1000));
			
			//to update value in object
			v.set(1, 100);
			System.out.println(v);
			
			//to add new value
			v.add(2, "Rajput");
			System.out.println(v);
			
			//to remove
			v.remove("Rajput");
			System.out.println(v);
			
			//to get value at 0 index
			System.out.println(v.get(0));
			

			System.out.println("----------------By for each loop-----------------");
			
			for(Object o : v)
			{
				System.out.println();
			}
			
			System.out.println("----------------By Iterator Cursor-----------------");
			
			Iterator itr = v.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("--------By ListIterator Cursor----------------");
			
			ListIterator li = v.listIterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
			
			System.out.println("------------By Enumeration Cursor-------------------");
			
			Enumeration en = v.elements();
			
			while(en.hasMoreElements())
			{
				System.out.println(en.nextElement());
			}
		}

}
