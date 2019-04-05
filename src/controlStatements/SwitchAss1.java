package controlStatements;

//Wap to Simulate Traffic Signal Light,and also it should support amber,
//yellow and orange which means caution. Green means Proceed and red means stop.

import java.util.Scanner;

class SwitchAss1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traffic signal color");

		String signalcolor = sc.nextLine();
			   signalcolor = signalcolor.toLowerCase();

		switch(signalcolor)
		{
			case "red":
			System.out.println("Stop!");
			break;

			case "green":
			System.out.println("Proceed");
			break;
			
			case "yellow":
			System.out.println("caution");
			break;
			
			case "orange":
			System.out.println("caution");
			break;
			
			default:
			System.out.println("Invalid color");
		}
	}
}
