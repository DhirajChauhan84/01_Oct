package Array;

public class Array 
{
	/*	Array is a collection of same type of data
	 * 
	 * there are 2 types of arrays
	 * 1.	Single DImensional Array
	 * 2.	MultiDimensional Array 
	 */
	
	public static void main(String[] args) 
	{
		//String array
		
		
		System.out.println("for String array");
		
		//Array declaration
		
		String s [] = new String[5];
		
		//Array Initialization
		
		s[0] = "Dhiraj";
		s[1] = "Rahul";
		s[2] = "Abhishek";
		s[3] = "Amol";
		s[4] = "Mahesh";
		
		//To find length of the array
		
		System.out.println("The length of the array s[] :"+s.length);
		
		// To find last index no of the array
		
		System.out.println("The last index no of the array s[] :"+(s.length-1));
		
		//Usage
		
		//By printing statement
		
		System.out.println("By printing statement");
		
		System.out.println("The value in s[0] :"+s[0]);
		
		System.out.println("The value in s[1] :"+s[1]);
		
		System.out.println("The value in s[2] :"+s[2]);
		
		System.out.println("The value in s[3] :"+s[3]);
		
		System.out.println("The value in s[4] :"+s[4]);
		
		System.out.println("-------------------------");
		
		System.out.println("By for loop");
		
		
		//By for loop
		
		for(int i = 0; i<=4; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("--------------------------");
		
		
		System.out.println("By for loop with last index of the array");
		
		//By for loop with last index
		for(int i = 0; i<=s.length-1; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("--------------------------");
		
		
		
		
		//int array
		
		//array declaration
		
		System.out.println("For int array");
		
		int i [] = new int[5];
		
		//array initialization
		
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		i[4] = 5;
		
		//Usage
		
		//By printing statement
		
		System.out.println("By printing statement");
		
		System.out.println("The value in i[0] :"+i[0]);
		
		System.out.println("the value in i[1] :"+i[1]);
		
		System.out.println("the value in i[2] :"+i[2]);
		
		System.out.println("the value in i[3] :"+i[3]);
		
		System.out.println("the value in i[4] :"+i[4]);
		
		System.out.println("----------------------");
		
		//By for loop
		
		System.out.println("By for loop");
		
		for(int a = 0; a<=4; a++)
		{
			System.out.println(i[a]);
		}
		
		System.out.println("--------------------");
		
		//by for loop with last index no
		
		System.out.println("By for loop with last index no");
		
		for(int a = 0 ; a<=i.length-1; a++)
		{
			System.out.println(i[a]);
		}
		
		System.out.println("------------------------------");
		
		
		
		
		//Char array
		
		System.out.println("For char array");
		
		// char array declaration
		
		char c [] = new char[5];
		
		// array initialization
		
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		c[3] = 'D';
		c[4] = 'E';
		
		//Usage
		
		//By printing statement
		
		System.out.println("By printing statement");
		
		System.out.println("The value in c[0] :"+c[0]);
		
		System.out.println("The value in c[1] :"+c[1]);
		
		System.out.println("The value in c[2] :"+c[2]);
		
		System.out.println("The value in c[3] :"+c[3]);
		
		System.out.println("The value in c[4] :"+c[4]);
		
		System.out.println("---------------------------");
		
		
		//By for loop
		
		System.out.println("By for loop");
		
		for(int b = 0; b<=4; b++)
		{
			System.out.println(c[b]);			
		}
		
		System.out.println("---------------------------");
		
		//By for loop with last index no
		
		System.out.println("By for loop with last index");
		
		for(int b = 0; b<=c.length-1; b++)
		{
			System.out.println(c[b]);
		}
		
	}

}
