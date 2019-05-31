package interviewPrograms;

public class To_Find_Length_of_String_Without_Using_Length_Function 
{
	public static void main(String[] args)
	{
		String str = "ManjunathBasavaraju";
		int count=0;
		
		for(char c : str.toCharArray()) 
		{
			count++;
		}
		
		System.out.println("String length is: " + count);
	}
}
