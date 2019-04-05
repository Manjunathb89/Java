package controlStatements;

import java.util.Scanner; 

class Demo
{ 
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		char ch = 'n';
		 
		String ans = ""; 
		while (ch!='y')
		{ 
			System.out.println("Will you lisyen to me?"); 
			ans = input.nextLine();
			ch = ans.charAt(0);// used to convert chart at ‘0’ place to lowercase
		}
	}
}

