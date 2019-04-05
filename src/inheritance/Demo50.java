/* Program for, User defined constructor in sub class and No argument constructor in super class */
package inheritance;
class G
{
	
}

class H extends G
{
	H(int a,int b,int c)
	{
		//super();
		/*This will be put by compiler by default.
		Since super class does not have a constructor, 
		it will first create a default constructor in the super class and in sub class uses super();*/
	}
}

class Demo50 
{
	public static void main(String[] args)
	{
		G g1=new G();
		H h1=new H(100,200,300);
	}
}
