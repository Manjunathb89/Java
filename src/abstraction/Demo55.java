/* Program for abstract and concrete methods */

package abstraction;

abstract class B  //class is abstract because it has abstract method
{
	abstract void print();// Here it has no method body, hence it called has abstract method
	
	//abstract static void disp1(); //we cannot have static and abstract 
	
	static void disp() //can have static and concrete
	{
		System.out.println("disp() method");
	}
}

class C extends B
{
	void print() 
	{
		System.out.println("print() implement in class c");
	}	
}

public class Demo55
{
	public static void main(String[] args)
	{
		C c1=new C();
		c1.print();
		c1.disp(); //complier will replace ref name with class name like c.disp()
		
		B.disp();//calling static concrete method of an abstract class	
	}
}
