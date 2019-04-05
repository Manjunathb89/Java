/*Concrete method in interface*/
package Interface;

interface QIDemo1
{
	void test1();
	
	default void test2() //concrete method in interface , on implementing this in classes it will be common method.
	{
		System.out.println("test2 implemented commonly in QIDemo1");
	}
}

class IA implements QIDemo1
{
	public void test1()
	{
		System.out.println("test1 implemented in class IA");
	}
	
	//test2() concrete method of interface also gets inherited here.
}

class IB implements QIDemo1
{
	public void test1()// overriding test1
	{
		System.out.println("test1  implemented in class IB");
	}
	
	public void test2()//overriding the concrete method(common method) of interface
	{
		System.out.println("My implementation overrides orignal implementation");
	}
}
public class QDemo1
{
	public static void main(String[] args) 
	{
		IA ia1=new IA();
		ia1.test1();
		ia1.test2();

		System.out.println("-----------------------------------------------");
		
		IB ib1=new IB();
		ib1.test1();
		ib1.test2();
	}
}
