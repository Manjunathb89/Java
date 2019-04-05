package interviewPrograms;

public class ToFindLengthOfStringWithoutUsingLengthFunction 
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
