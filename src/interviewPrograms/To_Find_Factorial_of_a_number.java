/*factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. 
 * For example:
4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120  */

package interviewPrograms;

class To_Find_Factorial_of_a_number
{
	    public static void main(String[] args) 
	    {
	        int num = 10;
	        long factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	            // factorial = factorial * i;
	            factorial *= i;
	        }
	        System.out.printf("Factorial of %d = %d", num, factorial);
	    }
}

