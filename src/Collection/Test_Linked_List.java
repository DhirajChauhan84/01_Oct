package Collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test_Linked_List 
{
		public static void main(String[] args) 
		{
				//LinkedList Class implements List (I)
			
			/*	- Duplicate are allowed in LinkedList 
				- Allows any no of null values 
				- Order of insertion-maintained 
			 	- No Default capacity in linkedList 
				- Data structure: linear 
				- Storage type is index
				
				- We can use Iterator and ListIterator cursor
				
				Methods in LinkedList
				1.add();
				2.size();
				3.isEmpty();
				4.remove();
				5.contains();
				6.set();
				7.indexOf();
				8.get();
				
				
			 */
			LinkedList ll = new LinkedList();
			
			ll.add("Dhiraj");
			
			ll.add(114);
			
			ll.add('A');
			
			ll.add("Dhiraj");
			
			ll.add(null);
			
			ll.add(null);
			
			System.out.println(ll);
			
			//to check object is Empty or not
			System.out.println(ll.isEmpty());
			
			//to check size of the object
			System.out.println(ll.size());
			
			//to check 114 is present in object or not
			System.out.println(ll.contains(114));
			
			//to add value at index 2
			ll.add(2,"Added");					//Right shift operation
			System.out.println(ll);
			
			//to remove
			ll.remove(2);						//Left shift operation
			System.out.println(ll);
			
			//to check value at index 4
			System.out.println(ll.get(4));
			
			//to check index of value
			System.out.println(ll.indexOf("Dhiraj"));
			
			//to update the value in object
			ll.set(3, "Dhiru");
			System.out.println(ll);
			
			System.out.println("--------------By For each loop--------------");
			
			for(Object o : ll)
			{
				System.out.println(o);
			}
			
			System.out.println("------------------By Iterator cursor---------");
			
			Iterator itr = ll.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("----------------By ListIterator cursor--------------------");
			
			ListIterator li = ll.listIterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
				
		}

}
