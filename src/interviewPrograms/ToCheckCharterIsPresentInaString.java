/*To Check Given Charter Is Present In a String or not*/

package interviewPrograms;

public class ToCheckCharterIsPresentInaString 
{
	public static void main(String[] args)
	{
		String str = "Manju";
		char c= 'a';
		boolean flag = false;
		
		for (int i=0;i<=str.length()-1;i++)
		{
			if(c == str.charAt(i))
			{
				flag = true;
				break;
			}
		}
			
		if(flag == true)
			{
				System.out.println("Given Chart is present in a string");
			}
		else
			{
				System.out.println("Given Chart is not present in a string");
			}
		
	}
}
