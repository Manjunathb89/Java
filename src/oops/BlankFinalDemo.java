/* Demo for initializing a blank final Class */

package oops;
class BlankFinalDemo 
{
	static final double PI; //blank final
	
	static 
	{
		PI=3.14;//Initialized in the static block
	}
	
	public static void main(String[] args) 
	{
		System.out.println(PI);
	}
}
