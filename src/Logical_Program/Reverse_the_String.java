package Logical_Program;

public class Reverse_the_String 
{
			//Write the program for reverse String
	
		public static void main(String[] args) 
		{
			String name = "Dhiraj";
			
		String rev = "";
				
				//By index values of each char
			
			for(int i =name.length()-1; i>=0; i--)
			{
				 rev = rev+name.charAt(i);			//j(5) + a(4) +r(3) +i(2) +h(1) +D(0)
			}
			
			System.out.println(rev);
			
		}

}
