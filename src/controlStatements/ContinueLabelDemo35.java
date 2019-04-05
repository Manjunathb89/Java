package controlStatements;

class ContinueLabelDemo35 
{
	public static void main(String[] args)
	{
		int j,k;
		Demo:
		for(j=0;j<5;j++)
		{
			for(k=0;k<5;k++)
			{
				if(j==k)
				continue Demo;
				System.out.println("j="+j+"k="+k);
			}
		}
	}
}
