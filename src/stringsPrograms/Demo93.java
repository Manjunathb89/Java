package stringsPrograms;

public class Demo93
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		StringBuffer sb1 = new StringBuffer(s1); 
		sb1.reverse();
		String s11 = sb1.toString();
		System.out.println(s11);
		s11 = new StringBuffer(s11).reverse().toString();
		System.out.println(s11);
	}
}
