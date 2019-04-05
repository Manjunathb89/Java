/* Program to genrate address */

package objectClass;

class Mosambi
{
	
}

class Demo85 
{
	public static void main(String[] args)
	{
		Mosambi m1=new Mosambi();
		System.out.println(m1);//Fully qualified address of the object is displayed
		
		System.out.println(m1.hashCode());//Unicode value of the object addrress is displayed.
		
		Class cls= m1.getClass();
		System.out.println(cls.getName()+""+Integer.toHexString(m1.hashCode()));		
	}
}
