package TypeCasting;

class Fruit
{
	void test()
	{
		System.out.println("test() of class Fruit");
	}
}

class Apple extends Fruit
{
	void test()
	{
		System.out.println("test() of class Apple");
	}
}

class OotyApple extends Apple
{
	void test()
	{
		System.out.println("test() of class OotyApple");
	}
}

class Execution
{
	static void start(Fruit f)
	{
		if(f instanceof Fruit)
			f.test();
		else
		System.out.println("test() of class OotyApple");
	}
}

public class Demo71 
{
	public static void main(String[] args) 
	{
		Fruit f1=new Fruit();
		Execution.start(f1);
		Execution.start(new Fruit());
		Execution.start(null);//generates nullpointer exception it can be handled using instanceof operator
		
		Apple a1=new Apple();
		Execution.start(a1);
		Execution.start(new Apple());
		
		OotyApple oa1=new OotyApple();
		Execution.start(oa1);
		Execution.start(new OotyApple());	
	}
}
