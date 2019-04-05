package Interface;

class jhum
{
	public void test()
	{
		System.out.println("Jhum Jhum Age");
	}
}

interface IJhumki
{
	default void test()
	{
		System.out.println("Jhumki from  Jhumkipur");
	}
}

class iI extends jhum implements IJhumki
{
	/**/
}

public class QDemo7 
{
	public static void main(String[] args)
	{
		iI ii=new iI();
		ii.test();
	}
}
