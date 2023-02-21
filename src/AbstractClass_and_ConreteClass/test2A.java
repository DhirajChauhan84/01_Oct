package AbstractClass_and_ConreteClass;

public class test2A extends test2
{
	//Concrete class
	
	//We have to implement the incomplete methods in concrete class(Override the incomplete methods)
	
	public void unlock()
	{
		System.out.print("Unlock the Mobile---->");
		
	}
	
	public void openWhatsapp()
	{
		System.out.print("Open the WhatsApp----->");
		
	}
	
	public void openGrp11Chat()
	{
		System.out.print("Open grp 11 chat----->");
		
	}
	
	public void sendMsg()
	{
		System.out.println("Send Hlw massage");
		
	}
	
	public static void main(String[] args) 
	{
		test2A ob = new test2A();
		
		ob.unlock();
		
		ob.openWhatsapp();
		
		ob.openGrp11Chat();
		
		ob.sendMsg();
		
	}
	

}
