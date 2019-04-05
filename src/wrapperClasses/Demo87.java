package wrapperClasses;

class c
{
	void test(double d)
	{
		System.out.println("double argument method");
	}
	void test(Integer intobj)
	{
		System.out.println("Integer argument method");
	}
	
	void test(Number num)
	{
		System.out.println("Number argument method");
	}
	
	void test(Object obj)
	{
		System.out.println("Integer argument method");
	}
	
	void test(int d)
	{
		System.out.println("Integer argument method");
	}
}

class Demo87 
{
	public static void main(String[] args) 
	{
		c c1=new c();
		c1.test(10);
	}

}
