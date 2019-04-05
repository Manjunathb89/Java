package wrapperClasses;

public class CharcterType 
{
	public static void main(String[] args)
	{
		Character ch=new Character('A');
		System.out.println(ch);
		
		ch=new Character((char)100);
		System.out.println(ch);
		
		Character ch2='B';
		char ch3=ch2.charValue();
		System.out.println(ch3);
		char ch4=ch2;
	}
}
