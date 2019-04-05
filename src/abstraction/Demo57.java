/* Program for using different access specifiers*/

package abstraction;

abstract class D
{
	abstract void test();
	
	abstract public void test1();
	
  //abstract private void test2(); private methods are not inherited and no question of overriding
	
	abstract protected void test3();
}

class E extends D 
{
	public void test()
	{
		System.out.println("test() of implemented in class B");
	}
	
	public void test1()
	{
		System.out.println("test1() of implemented in class B");
	}
	
	private void test2()
	{
		System.out.println("test2() of class B");//this private non-static members belongs to class B and not inherited from A
	}
	protected void test3()
	{
		System.out.println("test3() of implemented in class B");
	}
	
}
public class Demo57 
{
	public static void main(String[] args) 
	{
		
	}
}
