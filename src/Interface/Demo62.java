/*Implemented 1 Interface into class, and then extend that class and implemented another interface*/

package Interface;

interface Idemo3
{
	void test1();
}

interface Idemo4
{
	void test2();
}

class D implements Idemo3
{
	public void test1()
	{
		System.out.println("test1() is implemented in class D");
	}
}

class E extends D implements Idemo4
{
	public void test2()
	{
		System.out.println("test2() is implemented in class E");
	}
}

public class Demo62 
{
	public static void main(String[] args) 
	{
		E e1=new E();
		e1.test1();
		e1.test2();
	}
}
