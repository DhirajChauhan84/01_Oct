package Interface_for_mock;

import java.util.Scanner;

public class test12 implements Sample12A,Sample12B
{
	public static void main(String[] args) 
	{
		test12 t12 = new test12();
		
		//t12.licence();
		
		//t12.voterId();
		
		//t12.rankOfStud();
		
		t12.bloodDonation();
		
	}

	
	public void licence()
	{
		int age = 12;
		
		if(age>18)
		{
			System.out.println("You can apply for Driving Licence");
		}
		else
		{
			System.out.println("Your age is under 18 you can not apply for Driving Licence");
			
		}
			
		
	}
	
	
	public void voterId()
	{
		int age = 20;
		
		if(age>=18)
		{
			System.out.println("You can get Voter Id");
		}
		else
		{
			System.out.println("Your age is under 18");
		}
		
	}

	
	public void rankOfStud()
	{
		int marks = 70;
		
		if(marks>=80)
		{
			System.out.println("Passed in distiction");
		}
		else if(marks>=70)
		{
			System.out.println("Passed in 1st class");
		}
		
		else if(marks>=60)
		{
			System.out.println("Passed in 2nd class");
		}
		
		else if (marks>=50)
		{
			System.out.println("passed in 3rd class");
		}
		
		else if (marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}
	
	
	public void bloodDonation()
	{
		int age,weigth;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		
		age = sc.nextInt();
		
		System.out.println("enter weigth");
		
		weigth = sc.nextInt();
		
		sc.close();
		
		if(age>=18)
		{
			if(weigth>=50)
			{
				System.out.println("Yess, you can donate blood");
			}
			else
			{
				System.out.println("Your weigth is under 50 you can not donate blood");
			}
			
		}
		else
		{
			System.out.println("Your age is under 18 you can not donate blood");
		}
		
	}
}