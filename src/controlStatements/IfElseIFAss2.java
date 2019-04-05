package controlStatements;

//Take gender and age from user, 
//if male, check age is greater than = 21 eligible for marriage else not eligible for marriage
//if female, check age is greater than = 18 eligible for marriage else not eligible for marriage

import java.util.Scanner;
class IfElseIFAss2
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Gender: ");
		String gender =sc.nextLine();
		
		System.out.println("Enter your age");
		int age=sc.nextInt();

		if (gender.equals("male")) 
		{ 
			if(age>=21)
				{
					System.out.println("Eligible for marriage");
				}
			
				else
				{
					System.out.println("Not Eligible for marriage");			
				}
		}
		else if (gender.equals("female"))
		{
			if (age > 18)
			{
				System.out.println("Eligible for marriage");
			}
			else
			{
				System.out.println("Not Eligible for marriage");
			}
		}
		else
		System.out.println("Invalid Gender or Age , please enter valid information");
	}
}


//




