/*Multiple Inheritance of class with constructor(Int argument constructor) */

package inheritance;

class C
{
	int i,j;
	
	C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	
	void print()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}

class D extends C
{
	int a,b;
	
	D(int a,int b)
	{
		super(a,b);
		this.a=a;
		this.b=b;
	}
	
	void disp()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

class E extends D
{
	E()
	{
		super(555,666);
	}
	
	E(int x,int y)
	{
		super(x,y);
	}
}

class Demo51 
{
	public static void main(String[] args) 
	{
		C c1=new C(100,200);
		c1.print();
		
		System.out.println("---------------------------------");
		
		D d1=new D(300,400);
		d1.disp();
		d1.print();
		
		System.out.println("---------------------------------");
		
		E e1=new E();
		e1.disp();
		e1.print();
		
		System.out.println("---------------------------------");
		
		E e2=new E(500,600);
		e2.disp();
		e2.print();	
	}
}
