/* Interface ambiguity in interface */

package Interface;

interface IQDemo6
{
	void test1();
}

interface IQDemo7
{
	int test1();
}
/* 
class IE implements IQDemo6,IQDemo7
{
	//This will not compile 
}
*/
public class QDemo5
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}
}
