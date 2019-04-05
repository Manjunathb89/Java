package objectClass;

class orange
{
	
}
public class Demo79 
{
	public static void main(String[] args)
	{
		orange o1=new orange();
		
		System.out.println(o1);//print address, here it impilictly calls toString() method
		
		System.out.println(o1.toString());//print address, here it Expilictly calls toString() method
		
		System.out.println("-----------------------------");
		
		String s1=new String("Hello"); //Here it overriden to tostring()
		
		System.out.println(s1); //print value
		
		System.out.println(s1.toString());	//print value	
	}
}
