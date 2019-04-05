package controlStatements;

class BreakLabelDemo33 
{
	public static void main(String[] args) 
	{
		Demo:
		for(int i=0;i<=3;i++)
		{
			for(int j =2;j<=4;j++)
			{
				if(i==j)
				break Demo;
				System.out.print(i+""+j+"");
			}
			System.out.println();
		}
	}
}
