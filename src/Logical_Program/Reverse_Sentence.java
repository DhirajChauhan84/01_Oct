package Logical_Program;

public class Reverse_Sentence 
{
	//Reverse the Sentence
	
	public static void main(String[]args)
	{
		String orignal = "I am Dhiraj";
		
		System.out.println(reverseSentence(orignal));
	}
	
	public static String reverseSentence(String sentence)
	{
		String[] text = sentence.split(" ");
		
		String reverse = " ";
		
		for(int i = text.length-1; i>=0; i--)
		{
			reverse = reverse+text[i]+" ";
		}
		return reverse;
	}

}
