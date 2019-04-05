package objectClass;

class A
{
	int i=100;
	
	public String toString()
	{
		return "i=" +i;
	}
}
public class Demo80 
{
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1);
		
		System.out.println(new A());//i=100
		
		System.out.println(a1.toString());//i=100
		
		System.out.println(new Demo80());	
	}
}
