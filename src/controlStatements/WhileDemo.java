package controlStatements;

import java.util.Scanner;

class WhileDemo 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		String ans="no";
		while(!ans.equals("yes"))
		{ 
			System.out.println("Will you listen to me?");
			ans = input.nextLine();
		}
	}
}
