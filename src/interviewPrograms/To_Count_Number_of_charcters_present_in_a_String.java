package interviewPrograms;

class To_Count_Number_of_charcters_present_in_a_String 
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
		
		//2: Using length()
		System.out.println(Str.length());
	}
}
