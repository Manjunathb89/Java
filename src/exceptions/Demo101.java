package exceptions;

public class Demo101 
{
	public static void main(String[] args)
	{
		int i=10;
		int j=0;
		
		try
		{
			System.out.println("inside try block");
			j=i/0;
			System.out.println("exiting try block");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("inside catch block");
		}
	}
}

