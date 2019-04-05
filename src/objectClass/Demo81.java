package objectClass;

class B
{
	int i=100,j=200;
	
	public String toString()
	{
		return "i=" +i+",j="+ j ;
	}
}

class Demo81 
{
	public static void main(String[] args)
	{
		B b1=new B();
		System.out.println(b1);
		System.out.println(b1.toString());
		
		System.out.println(new B());//prints value
		
		System.out.println(new Demo81());	//prints address
	}
}
