/* Program for method overloading , method overriding and method hiding*/
package method_overloading_and_overridding;

class A
{
	void print()
	{
		System.out.println("Hiya");
	}
	
	static void test()
	{
		System.out.println("Static method");
	}
}

class B extends A
{
	void print()
	{
		System.out.println("Huya");//method overriding
	}
	
	static void test()//method hiding
	{
		System.out.println("Hidding");
	}
}

class Demo51 
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.print(); //calling over ridden method
		b1.test();//calling static method through reference variable , here compiler will replace b1 to B
		
		B.test();//calling inherited static method 
		//B.print(); //not possible (calling instance method through class name)
		
		
		A.test();//Original method class A
		
		A a1=new A();
		a1.print();
	}
}