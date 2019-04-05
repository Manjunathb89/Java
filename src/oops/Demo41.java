package oops;

class B
{
	static 
	{
		System.out.println("SIB of B class");
	}
	
	{
		System.out.println("IIB of B clas");
	}
}
class Demo41 
{
	static
	{
		System.out.println("SIB of Demo41 class");
	}

	public static void main(String[] args)
	{
		System.out.println("Main Method Starts");
		
		B b1=new B();
		B b2=new B();
		
		System.out.println("Main Method Ends");
	}
}
