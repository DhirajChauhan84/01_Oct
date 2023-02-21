package Constructor_for_mock;

public class task2_Students 
{
	String name;
	
	int rollNo;
	
	int marks;
	
	
	task2_Students()
	{
		
	}
	task2_Students(String nm, int rn, int mr)
	{
		
		this.name = nm;
		
		this.rollNo = rn;
		
		this.marks = mr;
		
		System.out.println("Name of the student :"+nm);
		
		System.out.println("Roll no of the student :"+rn);
		
		System.out.println("marks of the student :"+mr);
				
	}
	
	public void dot()
	{
		System.out.println("...............................................");
	}
	
	
	public static void main(String[] args) 
	{
		task2_Students s1 = new task2_Students("Dhiraj",101,98);	
		
		s1.dot();
		
		task2_Students s2 = new task2_Students("Rahul",102,97);
		
		s2.dot();
		
		task2_Students s3 = new task2_Students("Amol",103,93);
		
		s3.dot();
		
		task2_Students s4 = new task2_Students("Abhishek",104,87);
		
		s4.dot();
	}

}
