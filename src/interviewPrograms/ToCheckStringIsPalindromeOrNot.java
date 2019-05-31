package interviewPrograms;

public class ToCheckStringIsPalindromeOrNot 
{
	public static void main (String[] args)
	{
		String str = "MaaM";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not an Palindrome");
		}	
	}
}
