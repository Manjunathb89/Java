/* Program for calling static, non-static variables and methods present in abstract and concrete class*/

package abstraction;

abstract class A1
{
	static int i;
	int j;
	static final double PI=3.14;
	
	static void print()
	{
		System.out.println("i="+i);
	}
	
	void disp()
	{
		System.out.println("j="+j);
	}
	
	//abstract static void print1();
}

class B1 extends A1 //concrete class
{
	
}

public class Demo56 
{
	public static void main(String[] args)
	{
		B1 b1=new B1();
		b1.disp();
		A1.print();

		System.out.println("------------------");
		System.out.println(b1.j);//non static variable
		System.out.println(b1.i);//static variable
		System.out.println(A1.i);
		
		System.out.println("------------------");
		A1.print();//calling static method of an abstract class
		B1.print(); //calling a inherited static method		
	}
}
