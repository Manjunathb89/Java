/*implemented multiple Interface into class */

package Interface;

interface Idemo5
{
	void test1();
}

interface Idemo6
{
	void test2();
}

class F implements Idemo5,Idemo6
{
	public void test1()
	{
		System.out.println("test1() is implemented in class F");
	}
	public void test2()
	{
		System.out.println("test2() is implemented in class F");
	}
}

public class Demo63 
{
	public static void main(String[] args)
	{
		F f1=new F();
		f1.test1();
		f1.test2();
	}
}
