package Methods;

public class task_main_2 
{
	public static void main(String[]args)
	{
		
		System.out.println("The stages of SDLC are");
		//creating object
		
		task_g tg = new task_g();
		
		task_h th = new task_h();
		
		task_i ti = new task_i();
		
		//calling methods
		tg.info_gathering();
		tg.analysis();
		
		th.design();
		th.coding();
		
		ti.testing();
		ti.maintenance();
	
	}

}
