//handling multiple statements that can generate exception use separate try-catch block

package exceptions;

public class Demo102 
{
	public static void main(String[] args)
	{
		int i=10;
		int j;
		
		try
		{
			System.out.println("inside try block");
			j=i/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("inside ArithmeticException catch block");
			//e.printStackTrace();
		}
		
		try
		{
			System.out.println("inside NumberFormatException try block");
			int k= Integer.parseInt("test");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("inside NumberFormatException catch block");
			//e.printStackTrace();
		}
		
		System.out.println("i="+i);
	}
}
