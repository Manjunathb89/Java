package Interface;

interface IQDemo4
{
	void test();
}

interface IQDemo5
{
	void test();
}

class ID implements IQDemo4,IQDemo5
{
	public void test() 
	{
		System.out.println("test() implemented in class D");
	}	
}

public class QDemo4
{
	public static void main(String[] args) 
	{
		ID id=new ID();
		id.test();
	}
}
