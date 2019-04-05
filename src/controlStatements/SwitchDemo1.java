package controlStatements;

//Write a program the elements for given atomic numbers.
//switch case with byte

import java.util.Scanner;
class SwitchDemo1
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter automic number");
	  
	  byte atmno= sc.nextByte();
	  final int x = 34;
  
    	 switch(atmno)
	 {
		case 1:
		System.out.println("Hydrogen");
		break;

		case 2:
		System.out.println("Helenium");
		break;
		
		//case 2: Duplicate case statments are allowed to use
			//System.out.println("Helenium");
			//break;

		case x:// Variable can be used , but it should be constant and declared as variable..Type of the variable and input type should be same
		System.out.println("Selenium");
		break;
	
		default:// default can be used anywhere but compulursaloly we should use 'break'
		System.out.println("In valid automatic number");
		break;

		case 8:
		System.out.println("Helenium");

	}

    }
}
