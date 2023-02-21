package Casting_for_mock;

public class Son2 extends Father2
{
	
	public void bike()
	{
		System.out.println("Royal Enfield");
	}
	
	public void laptop()
	{
		System.out.println("Dell");
	}
	
	public void home()
	{
		System.out.println("5 flats");
	}
	
	public void car()
	{
		System.out.println("Verna");
	}
	
	public void cash()
	{
		System.out.println("1 lakh");
	}
	public static void main(String[] args) 
	{
		//Creating object of Son2
		
		Son2 s = new Son2();
		
		s.bike();
		
		s.laptop();
		
		s.home();
		
		s.car();
		
		s.cash();
		
		System.out.println("--------------------------------");
		
		//Creating object of Son2 with reference of Father2
		
		
		Father2 f = new Son2();
		
		f.car();
		
		f.home();
		
		f.cash();
		
		
	}

}
