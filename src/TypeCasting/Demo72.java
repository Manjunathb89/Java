package TypeCasting;

abstract class AbDemo
{
	void test1()
	{
		System.out.println("test1() of class AbDemo");
	}
	
	abstract void test2();
}

class ConDemo extends AbDemo
{
	void test2()
	{
		System.out.println("test2() of class ConDemo");
	}
	
	void test3()
	{
		System.out.println("test3() of class ConDemo");
	}
}

public class Demo72 
{
	public static void main(String[] args) 
	{
		AbDemo a= new ConDemo ();
		a.test1();
		a.test2();
		//a.test3(); //its own members are not accessiable after upcasting
	}
}
