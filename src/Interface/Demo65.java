/*extend multiple Interface into interface, and then implemented that interface into class*/

package Interface;

interface Idemo9
{
	void test1();
}

interface Idemo10
{
	void test2();
}

interface Idemo11 extends Idemo9,Idemo10
{
	void test3();
}

class I implements Idemo11
{
	public void test1()
	{
		System.out.println("test1() is implemented in class I");
	}
	
	public void test2()
	{
		System.out.println("test2() is implemented in class I");
	}
	
	public void test3()
	{
		System.out.println("test3() is implemented in class I");
	}
}

public class Demo65
{
	public static void main(String[] args)
	{
		I i1=new I();
		i1.test1();
		i1.test2();
		i1.test3();
	}
}