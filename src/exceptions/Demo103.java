package exceptions;

public class Demo103
{
	public static void main(String[] args) 
	{
			int i=10;
			int j;
			
			try 
			{
				System.out.println("inside try block");
				try
				{
					System.out.println("inside inner try block");
					int k=Integer.parseInt("Hunder");
				}
				
				catch(NumberFormatException e)
				{
					System.out.println("inside inner catch block (NumberFormatException)");
					//e.printStackTrace();
				}
				System.out.println("back to outer try block");
				j=i/0;
			}
			
				catch(ArithmeticException e)
				{
					System.out.println("inside outer catch  block (ArithmeticException)");
					//e.printStackTrace();
				}
		   System.out.println("i="+i);
		}
}
