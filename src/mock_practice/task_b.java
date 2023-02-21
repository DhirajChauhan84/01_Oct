package mock_practice;

public class task_b 
{
	
	public static void main(String[]args)
	   {
	      task_a t1 = new task_a();
	      task_c t2 = new task_c();
	      t1.m1();

	      t1.m2();
	      t2.m4();
	     
	      task_a.m3();
	      task_c.static_method();
	      task_c.static2_method();
	   }

}
