package operators;
class Demo18
{
	public static void main (String[] args)
	{
		int i=0, j=1;
		
		int k = i + j++ + ++i + ++j + i++;
		//k=0;
		//0+1+1+3+1 
		
		System.out.println("i= " + i);//j=2
		System.out.println("j= " + j);//j=3
		System.out.println("k= " + k);//k=6
	}
}