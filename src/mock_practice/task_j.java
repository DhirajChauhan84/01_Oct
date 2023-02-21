package mock_practice;

public class task_j 
{
	public void info_dhiraj(String name,long moNo,String Role, int teamNo,int empID, char grade)
	{
		System.out.println("Name of the employee : "+name);
		
		System.out.println("Mobile No of the employee : "+moNo);
		
		System.out.println("Role of the employee : "+Role);
		
		System.out.println("Team no of the employee : "+teamNo);
		
		System.out.println("Employee Id of the employee : "+empID);
		
		System.out.println("Grade of the employee : "+grade);
		
		System.out.println("............................................");
	}
	
	public void info_payal(String name,long moNo,String Role, int teamNo,int empID, char grade)
	{
		
		System.out.println("Name of the employee : "+name);
		
		System.out.println("Mobile No of the employee : "+moNo);
		
		System.out.println("Role of the employee : "+Role);
		
		System.out.println("Team no of the employee : "+teamNo);
		
		System.out.println("Employee Id of the employee : "+empID);
		
		System.out.println("Grade of the employee : "+grade);
		
		System.out.println("............................................");
	}
	
	public void info_sonali(String name,long moNo,String Role, int teamNo,int empID, char grade)
	{
		System.out.println("Name of the employee : "+name);
		
		System.out.println("Mobile No of the employee : "+moNo);
		
		System.out.println("Role of the employee : "+Role);
		
		System.out.println("Team no of the employee : "+teamNo);
		
		System.out.println("Employee Id of the employee : "+empID);
		
		System.out.println("Grade of the employee : "+grade);
		
		System.out.println("............................................");
	}
	
	public void info_sushant(String name,long moNo,String Role, int teamNo,int empID, char grade)
	{
		System.out.println("Name of the employee : "+name);
		
		System.out.println("Mobile No of the employee : "+moNo);
		
		System.out.println("Role of the employee : "+Role);
		
		System.out.println("Team no of the employee : "+teamNo);
		
		System.out.println("Employee Id of the employee : "+empID);
		
		System.out.println("Grade of the employee : "+grade);
		
		System.out.println("............................................");
	}
	
	public static void main(String[]args)
	{
		task_j ob1 = new task_j();
		ob1.info_dhiraj("Dhiraj Rajput", 8600412337L, "Software Tester", 11, 1, 'A');
		
		ob1.info_payal("Payal Khurpe", 8459365222L, "Software Tester", 11, 2, 'A');
		
		ob1.info_sonali("Sonali Ghatol", 8600008559L,"Software Tester",11,3,'A');
		
		ob1.info_sushant("Sushant Shinde",8412983561L,"Sofware Tester",11,4,'A');
		
		
	}

}
