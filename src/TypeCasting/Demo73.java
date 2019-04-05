package TypeCasting;

abstract class AbDemo1
{
	void test1()
	{
		System.out.println("test1() of class AbDemo1");
	}
	
	abstract void test2();
}

abstract  class AbDemo2 extends AbDemo1
{
	void test2()
	{
		System.out.println("test2() implemented in AbDemo2");
	}
	
	abstract void test3();
}

class ConDemo1 extends AbDemo2
{
	void test3()
	{
		System.out.println("test3() implemented in ConDemo1");
	}
}

public class Demo73
{
	public static void main(String[] args) 
	{
		AbDemo1 a1= new ConDemo1();
		a1.test1();
		a1.test2();
		//a.test3(); //its own members are not accessiable after upcasting
		
		System.out.println("----------------------");
		
		AbDemo2 a2= new ConDemo1();
		a2.test1();
		a2.test2();
		a2.test3(); 
	}
}
