package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test_ArrayList3 
{
	public static void main(String[] args) 
	{
			ArrayList ar = new ArrayList();
			
			//to add value
			ar.add("Dhiraj");
			
			ar.add("Rajput");
			
			ar.add(12);
			
			ar.add(10.10);
			
			ar.add('A');
			
			ar.add(12);
			
			ar.add(null);
			
			System.out.println(ar);
			
			//to check object is empty or not
			System.out.println(ar.isEmpty());
			
			//to check size
			System.out.println(ar.size());
			
			//to check value contains or not
			System.out.println(ar.contains(12));
			
			ar.add(0,"Aishwarya");			//Right shift operation
			System.out.println(ar);
			
			//to remove 
			ar.remove(null);				//Left shift operation
			System.out.println(ar);
			
			//to update
			ar.set(2, "Chauhan");
			System.out.println(ar);
			
			//to get index of value
			System.out.println(ar.indexOf("Dhiraj"));
			
			//to get value at index 3
			System.out.println(ar.get(3));
			
			System.out.println("-------------For each loop-----------------");
			
			for(Object o : ar)
			{
				System.out.println(o);
			}
			
			System.out.println("------------Iterator Courser----------------");
			
			Iterator itr = ar.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("----------------ListIterator Curser--------------");
			
			ListIterator litr = ar.listIterator();
			
			while(litr.hasNext())
			{
				System.out.println(litr.next());
			}
			
			
			
			
			
			
			
	}

}
