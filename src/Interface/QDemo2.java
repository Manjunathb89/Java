/*Using static method in interface*/

package Interface;

interface IQDemo2 
{
	 static void print()
	 {
		 System.out.println();
	 }
}
class IC implements IQDemo2 
{
	//static method from IQDemo2 is not inherited here
}
public class QDemo2 
{
	public static void main(String[] args)
	{
		IQDemo2.print();
		//IC ic=new IC();
		//ic.print();	//it will not work, since static method of interface is not inherited
	}
}
