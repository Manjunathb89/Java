/*Implemented Interface in class*/

package Interface;

abstract interface Idemo1 //abstract is optional as it is default
{
	void test1(); ////public & abstract is optional as the method in interface is by default public & abstract 
	
	public abstract void test2();
}

class A implements Idemo1
{
	public void test1() // we have to put public compulsorily as it is by default public in interface
	{
		System.out.println("test1() implemented in class A");
	}
	
	public void test2()
	{
		System.out.println("test2() implemented in class B");
	}
	
	void disp()
	{
		test2();//can call directly
	}
}

public class Demo60 
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.test1();
		a1.test2();
		a1.disp();
	}
}
