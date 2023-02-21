package Logical_Program;

import java.util.Scanner;

public class Test_Pallendrome2 
{
	//to check Pallendrome String by Scanner class
	
		public static void main(String[] args) 
		{
			//Creating object of scanner class
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("Enter the String");
			
			//calling non-static method present in Scanner class
			String nm = sc.next();
			
			String rev = "";
			
			String rev2 = "";
			
			//loop for Reversing String
			for(int i =nm.length()-1; i>=0; i--)
			{
				rev = rev + nm.charAt(i);
					//OR
				rev2 = nm.charAt(i)+rev2 ;
				
			}
			System.out.println(rev);
			
			System.out.println(rev2);
			
			if(nm.equals(rev))
			{
				System.out.println("The String is pallendrome");
				
			}
			else
			{
				System.out.println("The String is not pallendrome");

			}
		}

}
