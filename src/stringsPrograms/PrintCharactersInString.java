package stringsPrograms;
/*WAP to print the characters present in a string*/

public class PrintCharactersInString 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="Manjunath";
		for(int i=0;i<str.length()-1;i++)
		{
			char val=str.charAt(i);
			System.out.println(val);
		}
	}

}
