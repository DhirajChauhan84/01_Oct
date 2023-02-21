package Collection_for_mock;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test_Vector 
{
	public static void main(String[] args) 
	{
			Vector v = new Vector();
			
		//to add
			v.add("Dhiraj");
			
			v.add("Rajput");
			
			v.add(null);
			
			v.add(101);
			
			v.add(101);
			
			v.add(null);
			
			v.add(123.321);
			
			System.out.println(v);
			
		//to check collection object is empty or not
			System.out.println(v.isEmpty());			//return boolean
			
		//to check size
			System.out.println(v.size());				//return int
		
		//to check index of value
			System.out.println(v.indexOf(101));	 		//return index value    if double values are there then first matching 
																			  	//value will be shown
			
		//to get value at index 3
			System.out.println(v.get(3));				//return value 
			
		//to add value at index 3
			v.add(3,12);
			System.out.println(v.get(3));
			
		//to remove 
			v.remove(null);
			System.out.println(v);
			
			
			System.out.println("---------By for each loop cursor-----------");
			
			for(Object o : v)
			{
				System.out.println(o);
			}
			
			System.out.println("--------By Iterator cursor------------");
			
			Iterator itr = v.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("-----------By ListIterator cursor---------");
			
			ListIterator li = v.listIterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
			System.out.println("Printing from bottom by ListIterator");
			
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
			}
			
			System.out.println("------------By Enumeration cursor-----------");
			
			Enumeration e = v.elements();
			
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
			
			
			
			
			
		
		}

}
