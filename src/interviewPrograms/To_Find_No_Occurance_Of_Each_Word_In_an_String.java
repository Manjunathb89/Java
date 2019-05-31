package interviewPrograms;

class To_Find_No_Occurance_Of_Each_Word_In_an_String
{
	public static void main(String[] args)
	{
		String s1= "Manjunath basavraju working in lam and working in eliga";
		String[] CWord= s1.split(" ");
		int counter = 0;
		
		for(int i=0;i<CWord.length;i++)
		{
			if( CWord[i].length()!=0)
			{
				counter = 1;
				for(int j=i+1;j<CWord.length;j++)
				{
					if(CWord[i].equals(CWord[j]))
					{
						counter++;
						CWord[j]="";
					}	
				}
				System.out.println(CWord[i]+"="+counter);
			}
		}
	}
}
