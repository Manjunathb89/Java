/*Demo program for inheritance*/
package inheritance;

class A
{
	int i=100;
	static int j=200;
	private int k=300;//does not get inherited
	
	void print()
	{
		System.out.println("i="+i);
	}
	
	static void disp()
	{
		System.out.println("j="+j);
	}
}

class B extends A
{
	
}

class InheritDemo
{
	public static void main(String[] args) 
	{
		System.out.println("--assesing instance members--");
		B b1=new B();
		b1.print();
		System.out.println(b1.i);
		
		System.out.println("--assesing static members-----");
		B.disp();
		System.out.println(B.j);
		
		System.out.println("--------------------------------");
		b1.disp();//compiler will replace b1 with class B
		System.out.println(b1.j);//--ditto
		
		//System.out.println(b1.k);//private members are not inherited
	}
}
