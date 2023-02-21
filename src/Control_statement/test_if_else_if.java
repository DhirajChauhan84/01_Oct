package Control_statement;

import java.util.Scanner;

public class test_if_else_if 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age= sc.nextInt();
		
		if(age>18)
		{
			System.out.println("You are eligible to apply for voter ID");
		}
		else if(age>=18)
		{
			System.out.println("You can apply for voter ID next year");
		}
		else
		{
			System.out.println("You are not eligible for voter ID");
		}
	}

}
