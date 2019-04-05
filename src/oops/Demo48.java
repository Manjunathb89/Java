package oops;
/*Constructor overloading*/

class I
{
	int i,j;
	long l;
	String a,b;
	
	I(int u,int v)
	{
		i=u;
		j=v;
	}
	
	I(int x, long y)
	{
		i=x;
		l=y;
	}
	
	I(String s, int p)
	{
		a=s;
		i=p;
	}
	
	I(int p, String s)
	{
		a=s;
		l=p;
	}
}
class Demo48 
{
	public static void main(String[] args)
	{
		I i1=new I(100,200);
		System.out.println(i1.i);
		System.out.println(i1.j);
		System.out.println("--------------");
		
		I i2=new I("Star",20);
		System.out.println(i2.i);
		System.out.println(i2.j);
		System.out.println(i2.a);
		System.out.println(i2.b);
		System.out.println(i2.l);
		System.out.println("--------------");
		
		I i3=new I(30,"Star");
		System.out.println(i3.i);
		System.out.println(i3.a);
		System.out.println(i3.b);
		System.out.println("--------------");
	}
}
