package methods;

//Write a program (using method) which takes 2 numbers and return the sum

public class SumOfTwoNumbers
{
	public static void main (String[] args)
		{
		   int res = sumOfNumbers(458,9664);
		   System.out.println("Sum of two numbers is " + res);
		}
	
	static int sumOfNumbers(int a,int b)
		{
		 	int add = a+b;
		 	return add;
		}
}
