/*Implemented Interface into abstract class and then extended abstract class into class*/

package Interface;

interface Idemo2
{
	void test1();
	
	void test2();
}

abstract class B implements Idemo2
{
	public void test1()
	{
		System.out.println("test() is implemented in class B");
	}
}

class C extends B
{
	 public void test2()
	{
		 System.out.println("test() is implemented in class C");
	}
}
public class Demo61 
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.test1();
		c1.test2();
	}
}
