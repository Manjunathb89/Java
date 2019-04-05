package operators;
class Demo17
{
	public static void main (String[] args)
	{
		int i=0, j=0;
		
		j= i + i++ +i + i++;//j=0
		//0++1+1 usage value of i
		System.out.println("i= " + i);//i=2  //0+1+0+1=2
		System.out.println("j= " + j);//j=2
		
		int k=0, l=0;
		k= ++l;//k=0
		System.out.println("k= " + k);//k=1
		System.out.println("l= " + l);//l=1
		
	}
}