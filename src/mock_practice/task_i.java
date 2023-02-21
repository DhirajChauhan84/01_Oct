package mock_practice;

public class task_i 
{
	public void e(String name, int rollNo)
	{
		System.out.println("Name of student : "+name);
		System.out.println("Roll no of student : "+rollNo);
	}
	
	public void f(String name, int rollNo) 
	{
		System.out.println("Name of student : "+name);
		System.out.println("Roll no of student : "+rollNo);
	}
	
	public static void main(String[]args)
	{
		task_g.a();
		task_g ob1 = new task_g();
		ob1.b("Viraj", 1);
		
		task_h ob2 = new task_h();
		ob2.c();
		task_h.d("Swaraj", 2, 89.4f);
		task_i ob3 = new task_i();
		ob3.e("Shrinivas", 3);
		ob3.f("Shivam", 4);
		
		
	}

}
