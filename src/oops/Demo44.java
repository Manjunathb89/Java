package oops;
/* Demo Program 2 for Constructor */
class E
{
	E()
	{
		System.out.println("Constructor of class E");
	}
	
	static
	{
		System.out.println("SIB of class E");
	}
	
	{
		System.out.println("IIB of class E");
	}
}

class Demo44 
{
	static 
		{
			System.out.println("SIB of class Demo44 ");
		}
	
		{
			System.out.println("IIB of class Demo44 ");
		}

	public static void main(String[] args) 
		{
			System.out.println("Main Starts");
			E e = new E();
			E e1 = new E();
			System.out.println("Main Ends");
			
			new Demo44();
		}

}
