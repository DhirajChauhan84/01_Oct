package Control_statement_mock;

import java.util.Scanner;

public class test_if_else_if_scanner 
{
	public static void main(String[] args) 
	{
		int a;
		
		Scanner sonali = new Scanner(System.in);
		
		System.out.println("Plz enter the marks");
		
		a= sonali.nextInt();
		
		sonali.close();
		
		//System.out.println("The value of a is:"+a);
		
		if(a>=65)
		{
			System.out.println("Student pass in distinction");
		}
		else if(a>=35)
		{
			System.out.println("Student is pass");
			
		}
		else
		{
			System.out.println("Student is failed");
		}
		
		
		
		
		
	}

}
