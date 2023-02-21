package mock_practice;

public class task_l
{

	public static void main(String[] args) 
	{
		task_l.sstatic("I am static method from this class");
		task_l.sstatic("I am 1static method from this class");
		task_l.sstatic("I am 2static method from this class");
		task_l.sstatic("I am static method from this class");
		
		task_m.m();
		task_m.m2();
		task_m.m3();
		
		task_m ob1 = new task_m();
		ob1.ns("i am nonstatic ns method from task_m");
		ob1.ns2("i am nonstatic ns2 method from task_m");
		
		task_n.m5();
		task_n.m6();
		
		task_n ob2 = new task_n();
		ob2.ns3("i am nonstatic ns3 method from task_n");
		ob2.ns4("i am nonstatic ns4 method from task_n");
		
	}
	
	public static void sstatic(String word)
	{
		System.out.println(word);
	}
}
