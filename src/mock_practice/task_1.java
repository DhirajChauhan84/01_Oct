package mock_practice;

public class task_1 
{
	public static void main(String[] args) 
	{
		task_2.m1("hi... i am non static method m1 from class 2 ");
		
		task_2 ob1 = new task_2();
		ob1.m2();
		
		
		task_3 ob2 = new task_3();
		ob2.m2(100, 100.1f);
		
		task_3.m3();
		
		task_4.m4();
		
		task_4 ob3 = new task_4();
		
		ob3.m5();
		
	}

}
