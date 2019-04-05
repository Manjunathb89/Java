package TypeCasting;

class D
{
	void test1()
	{
		System.out.println("test1() of class D");
	}
}

class E extends D
{
	void test2()
	{
		System.out.println("test1() of class E");
	}
}

public class Demo70 
{
	public static void main(String[] args)
	{
		D d1=new E();
		d1.test1();
		//d1.test2();//can't access its own class members because of upcasting
		
		System.out.println("--------------------------");
		D d2=new D();
		//E e1=(E) d2;
		//E e1=(E) new D();
		
		System.out.println("--------------------------");
		
		E e1 = (E) d1;
		e1.test1();
		e1.test2();	
	}
}
