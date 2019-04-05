package inheritance;
/*Inheritance of class with constructor overloading */

class A1
{
	int i;
	A1()
	{
		i=123;
	}
	
	A1(int i)
	{
		this.i=i;
	}
	
	A1(String S)
	{
		System.out.println(S);
	}
}

class B1 extends A1
{
	B1()
	{
		
	}
	
	B1(int x)
	{
		super(x);
	}
	
	B1(int a,int b,String S1,String S2, char ch)
	{
		super(a);
	}
}

class Demo52 
{
	public static void main(String[] args) 
	{
		A1 a1=new A1();//no argument cons is called
		new A1(10);//int argument constructor is called
		A1 a2=new A1("Hello");//string argument constructor is called
		
		B1 b1=new B1();
		new B1(100);
		B1 b2=new B1(300,400,"SuperMan","Star",'M');
	}
}
