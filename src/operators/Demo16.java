package operators;
class Demo16
{
	public static void main(String[] args)
	{
		int i=0;
		int j;
		
		j=i++;//j=0 use first the current value and then increment
		//System.out.println(j);//j=0
		System.out.println("i= " + i);//i=1
		System.out.println("j= " + j);//j=0
	}
}