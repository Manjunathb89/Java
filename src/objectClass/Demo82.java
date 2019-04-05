package objectClass;

class C
{
	
}

class Demo82 
{
	public static void main(String[] args) 
	{
		C c1=new C();
		C c2=new C();
		C c3=new C();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);		
		
		System.out.println(c1==c3);//it compars address
		System.out.println(c1.equals(c3));//equals methos is not overridden hence will compare address
		
		c1=c3;
		System.out.println(c1==c3);//it compars address
		System.out.println(c1.equals(c3));//equals methos is not overridden hence will compare address
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);	
		
		String s1=new String("java");
		String s2=new String("java");
		
		System.out.println(s1==s2);//it compars address
		System.out.println(s1.equals(s2));//value comparision , equals methos is overridden in string
	}
}
