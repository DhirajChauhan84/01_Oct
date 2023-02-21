package Logical_Program;

public class test_String_Pallendrome 
{
		public static void main(String[] args) 
		{
				
				String value = "MOM";
				
				String res = "";
				
				for(int i = value.length()-1; i>=0; i--)
				{
					 res = res + value.charAt(i);
				}
				System.out.println(res);
				
				if(value.equals(res))
				{
					System.out.println("The String is Pallendrome");
				}
				else
				{
					System.out.println("The String is not  Pallendrome");
				}
			
		}

}
