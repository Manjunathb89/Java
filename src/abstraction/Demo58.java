/*we can call abstract class constructor from only concrete sub class*/

package abstraction;

abstract class A
{
	int i;	
	A(int i) //we can have constructor for an abstract class
	{
		System.out.println();
		this.i =i;
	}
}		
	
class U extends A
{
		U()
		{
			super(100);
		}
}
	 
class Demo58 
{
	 
	public static void main(String[] args)
	{
		//A a1 = new A(); // A is abstract class, cannot be instantiated. Means we cannot create an object
		U b1 = new U(); 
		System.out.println(b1.i);
	}
}

	
	 


