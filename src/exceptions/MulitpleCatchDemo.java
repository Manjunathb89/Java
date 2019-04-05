package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MulitpleCatchDemo 
{
	public static void main(String[] args) 
	{
	       //try with "" or "hundred" or "12.56" or close Scanner like sc.close()
		
	       String str="12";
		   Scanner sc=new Scanner(str);
		 
		    int i=0;
	     
	        try 
	        {
			     i=sc.nextInt();
			}
		
	        catch(InputMismatchException imexp)
			{
		       System.out.println(imexp);		
			}

	      	catch(NoSuchElementException nsexp)
			{
				System.out.println(nsexp);
			}

			catch(IllegalStateException iaexp)
			{
				System.out.println(iaexp);
			}
	     
	     System.out.println(i);
	}
}
