package Constructor_for_mock;

public class task_Students3 
{
	String name ;
	
	int rollNo ;
	
	int marks ;
	
	
	task_Students3(String nm,int rn,int mr)
	{
		this.name = nm ;
		
		this.rollNo = rn ;
		
		this.marks = mr ;
		
		System.out.println("The name of the student :"+nm);
		
		System.out.println("the roll no of the student :"+rn);
		
		System.out.println("The marks of the students :"+mr);
				
	}
	
	public void dot()
	{
		System.out.println("......................................................");
	}
	
	public static void main(String[] args) 
	{
		
		
		task_Students3 s1 = new task_Students3("Dhiraj Rajput",101,70);
		
		
		
		s1.dot();
		
		task_Students3 s2 = new task_Students3("Payal Khurape",102,80);
		
		s2.dot();
		
		task_Students3 s3 = new task_Students3("Sonali Ghatol",103,90);
		
		s3.dot();
		
		task_Students3 s4 = new task_Students3("Sushant Shinde",104,99);
		
		s4.dot();
		
		System.out.println(s2.name);
				
		
		
	}

}
