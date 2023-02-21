package Collection_for_mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class diff_between_iteratorAndListIterator 
{
		/*	Both are the cursor 
		 * 
		 * 	1. Iterator
		 * 		we can get iterator cursor by iterator()
		 * 		iterator method = Iterator itr = (Collection objectName).iterator();
		 * 	
		 * 		iterator cursor can be use with any collection object 
		 * 		Iterator methods are - hasNext(),next() and remove()
		 * 
		 * 		By using Iterator cursor we can retrieve the elements only in forward direction
		 * 
		 * 		By Iterator cursor we can read & remove the element
		 */
	
		/*	2. ListIterator
		 * 			We can get ListIterator cursor by ListIterator()
		 * 			ListIterator method = ListIterator li = (Collection Object).listIterator();
		 * 	
		 * 			ListIterator cursor can be use with only list implemented classes
		 * 			ListIterator methods are - hasNext(),next(),hasPrevious,previous(),remove() and set()
		 * 
		 * 			By using ListIterator we can retrieve the elements in forward and backward direction
		 * 
		 * 			By ListIterator cursor we can read,add,remove and replace the element
		 * 			
		 * 
		 */
		public static void main(String[] args) 
		{
			//Creating collection object
			List l = new ArrayList();		//Up casting
			
			l.add(10);
			l.add("Dhiraj");
			l.add("Rajput");
			
			System.out.println(l);
			
			System.out.println("---------------By Iterator-----------");
			
			//by using iterator method
			Iterator itr = l.iterator();
			
			//using while loop for print
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("---------------By ListIterator-------");
			
			//by using ListIterator
			ListIterator li = l.listIterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
			
			System.out.println("-------------Backward Direction------------");
			
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
			}
		}

}
