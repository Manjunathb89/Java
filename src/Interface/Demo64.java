/*implemented multiple Interface into abstract class and extends abstract class*/

package Interface;

interface Idemo7
{
	void test1();
}

interface Idemo8
{
	void test2();
}

abstract class G implements Idemo7,Idemo8
{
	public void test1()
	{
		System.out.println("test1() is implemented in class G");
	}
}

class H extends G
{
	public void test2()
	{
		System.out.println("test2() is implemented in class H");
	}
}

public class Demo64 
{
	public static void main(String[] args)
	{
		H h1=new H();
		h1.test1();
		h1.test2();
	}
}

