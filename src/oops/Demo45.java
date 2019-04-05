package oops;
/*Pass value to the constructor*/
class F
{
	int i;
	
	F(int a)
	{
		i=a;
	}
}

class Demo45 
{
	public static void main(String[] args) 
	{
		F f1 = new F(100);
		System.out.println(f1.i);
		
		F f2 = new F(200);
		System.out.println(f2.i);
	}
}
