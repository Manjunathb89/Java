package patterns;

class PrintTriangle 
{
	public static void main(String[] args) 
	{
		int num=5;
			for(int i=0;i<num;i++) 
			{
				for(int j=(num-1);j>i;j--) 
				{
					System.out.print("");
				}
				for(int k=0;k<(i*2+1);k++) 
				{
					System.out.print("*");
				}
			System.out.println();
			}
	}
}
