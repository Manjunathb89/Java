package exceptions;

public class Demo104 
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
	
		catch(ArithmeticException exp)
	   	{
			System.out.println("inside catch block");
	   	}
	
		finally //To mandatorily execute block of code
		{
			System.out.println("inside finally block");
		}
     System.out.println("i="+i);
	}
}
