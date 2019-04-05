/*Count Number Of Charters present in a string using count variable*/

package interviewPrograms;

public class CountNumberOfChar 
{
	public static void main(String[] args) 
	{
		String Str="Manjunath B";
		int Count=0;
		
		for(int i=0;i<=Str.length()-1;i++)
		{
			Count++;		
		}
		System.out.println(Count);
	}

}
