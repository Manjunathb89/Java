package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatchBlockDemo
{
	public static void main(String[] args) 
	{
	       String str="";
		   Scanner sc=new Scanner(str);
		   sc.close();
		   
	        try 
	        {
			     sc.nextInt();
			}
		
	        //catch(InputMismatchException | NoSuchElementException | IllegalStateException iaexp )
	        //catch(NoSuchElementException |InputMismatchException | IllegalStateException iaexp )
	        catch(NoSuchElementException | IllegalStateException iaexp )
			{
		       System.out.println(iaexp);		
			}
	}
}
