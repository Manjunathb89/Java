package interviewPrograms;

public class To_PrintElements_Of_String_In_ReverseOrder 
{
	public static void main(String[] args)
	{
		String str= "ManjunathBasavaraju";
		for(int i=str.length()-1;i>=0;i--)
		{
			char revStr= str.charAt(i);
			System.out.print(revStr);
		}
		
		String s1="Qspiders";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		s2=s2+s1.charAt(i);
		System.out.println(s2);
		
		
		System.out.println("----------- 2.Reversing a string using charter Array--------");
			char chars[] = s1.toCharArray(); //converting string to chart Array
			String s4="";
			
			for(int i=chars.length-1;i>=0;i--)
			s4=s4+chars[i];
			System.out.println(s4);
		
		System.out.println("--------------3. To Reverse a string using split------------");
		
			String strr="I Love Java class";
			String words[]=strr.split(" ");
			
			for(int i=words.length-1;i>=0;i--)
			System.out.print(words[i]+" ");
		
		System.out.println("----------4. To Reverse a string using StringBuffer----------");
		
			String s1B = "Hello";
			StringBuffer sb1 = new StringBuffer(s1B); 
			sb1.reverse();
			String s11 = sb1.toString();
			System.out.println(sb1);
	}
}
