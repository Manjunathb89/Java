package practiceJava;

class Demo9 
{
	public static void main(String[] args)
	{
	int i,j,k;
	i=30;
	j=20;
	
	k=i+j;
	System.out.println("sum of i and j is "+ k);
	System.out.println("sum of " + i + " and " + j + " is "+ k);
	System.out.println(i + " + " + j + " = "+ k);
	
	k=i-j;
	System.out.println("difference of i and j is "+ k);
	
	k=i*j;
	System.out.println("product of i and j is "+ k);
	System.out.println("product of i and j is "+ (i*j));
	
	k=i/j;
	System.out.println("Division of i by j is "+ k);
	
	int quotient = i/j;
	System.out.println("quotient of i by j is "+ quotient);
	
	int remainder = i%j;
	System.out.println("Remainder of i by j is "+ remainder);
	
	System.out.println(20/30); //1
	}
}
