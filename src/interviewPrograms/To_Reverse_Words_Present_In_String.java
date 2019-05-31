package interviewPrograms;

public class To_Reverse_Words_Present_In_String 
{
	public static void main(String[] args)
	{	
		String str1="I work in Lam Research";
		String words[]=str1.split(" ");
	
		for(int i=0; i<=words.length-1;i++)
		System.out.println(words[i]+" ");
		
		System.out.println("---------------------");
			for(int i=0; i<words.length; i++)
			{
				StringBuffer s = new StringBuffer();
				s.append(words[i]);
				System.out.print(s.reverse()+" ");
				s.delete(0, s.length());
			}
		
		System.out.println("-----------------------------");	
			for(int i=0; i<words.length; i++)
			{
				StringBuffer s = new StringBuffer();
				s.append(words[i]);
				for(int j=0; j<s.length(); j++)
				{
					System.out.print(s.charAt(s.length()-j-1));	
				}
				System.out.print(" ");
				s.delete(0, s.length());
			} 
			
		System.out.println("------------------------------");
			String Inputstring="I work in Lam Research";
			String Words[]=Inputstring.split("\\s");
			String Outputstring = "";
		
			for(int i=Words.length-1;i>0;i--)
			{
				Outputstring = Outputstring + Words[i]+" ";
			}
			System.out.print(Outputstring);
	}
}
