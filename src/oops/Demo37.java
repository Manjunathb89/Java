package oops;
/* Different ways of calling static members(Variable and method) in same class */
public class Demo37 
{
	static int i=20;
	
	public static void main(String[] args) 
	{
		System.out.println(i); //direct access of static variable
		
		System.out.println(Demo37.i); //Accessing static variable with class name  
		
		test(); //direct access of static method
		
		Demo37.test();//Accessing static method with class name
	}

	static void test()
	{
		System.out.println("i=" + i); //direct access of static variable
		
		System.out.println(Demo37.i); //Accessing static variable with class name
	}
}
