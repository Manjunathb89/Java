/* Static Method , upcasting and also shadowing */

package TypeCasting;

abstract class AbDemo3
{
	int i=100;
	
	static void paint()
	{
		System.out.println("Paint() of AbDemo3");
	}
}

class ConDemo2 extends AbDemo3
{
	int i=200;//Inherited variable is shadowined by current i
	
	static void paint()
	{
		System.out.println("Paint() of ConDemo2");
	}
}

public class Demo74 
{
	public static void main(String[] args)
	{
	AbDemo3 ab3=new ConDemo2();
	ab3.paint(); //super class static method is called infact complier replaces ab3 with  AbDemo3.paint();
	
	System.out.println(ab3.i);//100 super class
	
	ConDemo2 cd2=new ConDemo2(); 
	System.out.println(cd2.i);//200 sub class i current class i shadows inherited i
	}
}
