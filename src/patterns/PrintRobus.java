package patterns;

public class PrintRobus {

	public static void main(String[] args)
	{
		for (int i=1;i<=3;i++)
		{
			for (int k=0;k<=3;k++)
				{
					System.out.print(" ");
				}
			for(int j =1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
