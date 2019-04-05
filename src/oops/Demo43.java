package oops;
/* Demo program for Constructor*/

class D
{
	int i;
	int j;
	
	D()//constructor block.
	{
		i=10;
		j=20;
	}
}

class Demo43 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("i="+d1.i);
		System.out.println("j="+d1.j);
	}
}
