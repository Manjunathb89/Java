package oops;

/*Program for single argument constructor like int , long and byte*/
class H
{
	int i;
	long l;
	byte b;
	
	H()
	{
		i=123;
	}
	
	H(int a)
	{
		i=a;
	}
	
	H(long b)
	{
		l=b;
	}
	
	H(byte c)
	{
		b=c;
	}	
}

class Demo47 
{
	public static void main(String[] args)
	{
		H h=new H();//calls no argument constructor
		System.out.println(h.i);
		System.out.println(h.b);
		System.out.println(h.l);
		
		H h1=new H(100);//calls int argument constructor
		System.out.println(h1.i);
		System.out.println(h1.l);
		System.out.println(h1.b);
		
		H h2=new H(200l);//calls long argument constructor
		System.out.println(h2.i);
		System.out.println(h2.l);
		System.out.println(h2.b);
		
		H h3=new H((byte)100);//calls byte argument constructor
		System.out.println(h3.i);
		System.out.println(h3.l);
		System.out.println(h3.b);	
	}
}
