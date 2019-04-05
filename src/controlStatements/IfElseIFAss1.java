package controlStatements;

import java.util.Scanner;

class IfElseIFAss1
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();

		if(marks>=0 && marks<35)
			System.out.println("Fail");
		else if (marks>=35 && marks<60)
			System.out.println("Pass");
	 	else if (marks>=60 && marks<75)
			System.out.println("First Class");
		else if (marks>=75 && marks<85)
			System.out.println("Destinction");
		else if (marks>=85 && marks<=100)
			System.out.println("First Class with Destinction");
		else 
			System.out.println("Invalid marks");
	}

}
