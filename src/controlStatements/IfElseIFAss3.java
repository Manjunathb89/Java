package controlStatements;
// Electric billing app


import java.util.Scanner;

class IfElseIFAss3
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units consumed");
		int Units = sc.nextInt();

		double Arrears =0.0;
		System.out.println("Do have any balance, please enter it");
		Arrears = sc.nextDouble();

		double Amount=0.0;
		double disc =(5.0/100.0)*100;
		double Totalamount;
		
		if(Arrears>0)
			Arrears = Arrears+((Arrears/100)*100);
		

		if(Units>0 && Units<=50)
		{
			Amount = Units*1.20;
			Totalamount = Amount+Arrears;
			System.out.println("Total amount payable " + Totalamount);
		}
		else if (Units>50 && Units<=100)
		{
			Amount = (50*1.20)+(Units-50)*2.40;
			Totalamount = Amount+Arrears;
			System.out.println("Total amount payable " +Totalamount);
		}

		else if (Units>100 && Units<=150)
		{
			Amount = (50*1.20)+(50*2.40)+(Units-100)*3.60;
			Totalamount = Amount+Arrears;
			System.out.println("Total amount payable " +Totalamount);
		}

		else if (Units>150 && Units<200)
		{
			Amount = (50*1.20)+(50*2.40)+(50*3.60)+(Units-150)*4.80;
			Totalamount = Amount+Arrears;
			System.out.println("Total amount payable " +Totalamount);
		}
		else if (Units>200)
		{
			if(Units==200)
			Amount = ((50*1.20)+(50*2.40)+(50*3.60)+(Units-150)*4.80);
			Amount = ((50*1.20)+(50*2.40)+(50*3.60)+(Units-150)*4.80)-disc;
			Totalamount = Amount+Arrears;
			System.out.println("Total amount payable " +Totalamount);
		}
		else
		System.out.println("Invalid units are entered");
	}
}