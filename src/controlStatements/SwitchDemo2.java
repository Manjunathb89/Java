package controlStatements;

//using switch case with Strings


import java.util.Scanner;

class SwitchDemo2
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country code");
		String cc = sc.nextLine();
	               cc = cc.toLowerCase();

	switch(cc)
	    {
		case "aus":
		System.out.println("Country is Austraila");
		break;

		case "ind":
		System.out.println("Country is India");
		break;

		case "nz":
		System.out.println("Country is New zealand");
		break;

		case "sl":
		System.out.println("Country is Sri lanka");
		break;

      	default:
		System.out.println("Invalid Country Code");
	   }
  }
}