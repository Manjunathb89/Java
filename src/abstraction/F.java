/* Program for abstract class having main method*/

package abstraction;

abstract class F
{
	static int i=55;
	
	static void print()
	{
		System.out.println("i="+i);
	}
	
	abstract void disp();
	
	public static void main(String[] args) 
	{
		F.print();
	}
}
