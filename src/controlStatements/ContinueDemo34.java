package controlStatements;

class ContinueDemo34
{
	public static void main(String[] args) 
	{
		for(int j=0;j<20;j+=2)
		{
			if(j==6)
			{
				continue;
			}
			System.out.println(j);
		}
	}
}
