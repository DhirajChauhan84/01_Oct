package Casting_for_mock;

public class odd_and_even_numbers extends even_numbers
{
	
	
	public void oddNo()
	{
		for(int a = 1;a<=10;a=a+2)
		{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) 
	{
		odd_and_even_numbers e = new odd_and_even_numbers();
		
		System.out.println("Odd Numbers from 0 to 10 from child class");
		
		e.oddNo();
		
		System.out.println("Even numbers from 0 to 10 from child class");
		
		e.evenNo();
			
		
		even_numbers o = new even_numbers();
		System.out.println("even numbers 0 to 10 from parent class");
		o.evenNo();
	}
	public void evenNo()
	{
		for(int a = 10;a<=20; a=a+2)
		{
			System.out.println(a);
			
		}
	}

}
