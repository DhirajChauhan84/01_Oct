package Control_statement_mock;

import java.util.Scanner;

public class test_nested_if 
{
	public static void main(String[] args) 
	{
		int age;
		int weight;
		
		Scanner object = new Scanner(System.in);
		
		System.out.println("Plz enter the age ");
		
		age = object.nextInt();
		
		System.out.println("Plz enter the weight");
		
		weight=object.nextInt();
		
		if(age>18)
		{
			if(weight >=50)
			{
				System.out.println("You can donate your blood");
			}
			else
			{
				System.out.println("You can not donate blood because your weight is under 50");
			}
		}
		else
		{
			System.out.println("You can not donate your blood because your age is under 18");
		}
		
	}

}
