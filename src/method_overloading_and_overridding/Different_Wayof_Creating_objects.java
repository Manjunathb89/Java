/*Different Way of Creating objects*/
package method_overloading_and_overridding;

public class Different_Wayof_Creating_objects 
{
	public static void main(String[] args) 
	{

	}
}
/********************1st way*************************/
class Apple
{
	Apple()
	{
		
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		Apple a1=new Apple();
	}
}

/********************2nd way*************************/
class Apple1
{
	private Apple1()
	{
		
	}
	
	static Apple1 getApple1()
	{
		return new Apple1();
	}
}

class Demo1
{
	public static void main(String[] args) 
	{
		//Apple1 a1=new Apple1();
		Apple1 a1=Apple1.getApple1();	
	}
}

/********************3rd way*************************/

class Apple2
{
	private Apple2()
	{
		
	}
	
	static Apple2  getApple2()
	{
		Apple2 a2=new Apple2();
		return a2;		
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Apple2.getApple2();	
	}
}

/********************4th way*************************/
//simple way to create single tone class/

class Orange
{
	private static Orange o1;
	private Orange()
	{
		
	}
	
	static Orange getOrange()
	{
		if(o1==null)
		o1=new Orange();
		return o1;		
	}
}

class Demo3
{
	public static void main(String[] args) 
	{
		Orange a1=Orange.getOrange();	
	}
}

/********************5th way*************************/

class Apple3
{
	/*private getApple3()
	{
		return new Apple3();
	}*/
}

class Demo4
{
	public static void main(String[] args) 
	{
		//Apple3 a3=Apple3.getApple3();	
	}
}

/********************6th way*************************/

class Apple4
{
	Apple4 getApple3()
	{
		return this;
	}
}

class Demo5
{
	public static void main(String[] args) 
	{
		Apple4 a3=new Apple4();
		Apple4 a4=a3.getApple3();	
		System.out.println(a3==a4);
	}
}