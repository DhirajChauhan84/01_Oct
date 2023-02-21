package Constructor_for_mock;

public class task_Students 
{
	
	String name ;
		
	int rollNo ;
	
	int marks ;
	
	char grade ;
	
	task_Students(String nm, int rn, int mr)
	{
		
		this.name = nm ;
		
		this.rollNo = rn ;
		
		this.marks = mr ;
		
		System.out.println("Name of the Student :" +nm);
		
		System.out.println("Roll no of the Student :"+rn);
		
		System.out.println("Marks of the Student :"+mr);
		
		
	}
	
	task_Students(String nm,int rn,int mr, char grade)
	{
		this(nm,rn,mr);
		
		this.grade = grade;
		
		System.out.println("Grade of the student :"+grade);
	}
	
	public void dot()
	{
		System.out.println("......................................");

	}
	
	public static void main(String[] args) 
	{
		
		//creating object
		
		task_Students s1 = new task_Students("Dhiraj Rajput",101,90);
		
		s1.dot();
		
		
		//creating 2nd object
		
		task_Students s2 = new task_Students("Payal Khurape",102,91);
		
		s2.dot();
		
		//creating 2nd object
		
		task_Students s3 = new task_Students("Sonali Ghatol",103,92);
		
		s3.dot();
		
		//creating 2nd object
		
		task_Students s4 = new task_Students("Sushant Shinde",104,93);
		
		s4.dot();
		
		task_Students s5 = new task_Students("Akshayni",105,100,'A');
		
		s5.dot();
	}
		

}
