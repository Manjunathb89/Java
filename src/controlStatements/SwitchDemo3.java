package controlStatements;

import java.util.Scanner;

class SwitchDemo3 {

	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter your country code");
		String ccode = Input.nextLine();
		
		ccode = ccode.toLowerCase();
		char cc = ccode.charAt(0);
			  
				switch(cc)
				{
				case 'a':
					System.out.println("America");
					break;
					
				case 'i':
					System.out.println("India");
					break;
					
				case 'j':
					System.out.println("Japan");
					break;
					
				default :
					System.out.println("Invalid country code");
					
				}
				

	}

} 
