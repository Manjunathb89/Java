/*Abstract methods inherited in sub classes */
package abstraction;

abstract class W
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

abstract class X extends W
{
	void test1()
	{
		System.out.println("test1() implements in class x");
	}
}

abstract class Y extends X
{
	void test2()
	{
		System.out.println("test2() implements in class Y");
	}
}

class Z extends Y
{
	void test3()
	{
		System.out.println("test3() implements in class Z");
	}
}

public class Demo59 
{
	public static void main(String[] args) 
	{
		Z z1 =new Z();
		z1.test1();
		z1.test2();
		z1.test3();
	}

}
