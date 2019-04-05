package oops;

class Apple 
{

}

class VariableDemo2 
{
		int i,j;
		String s;
		Apple a;
		
		static int x,y;
		static String s1;
		static Apple a1;
		
		/* variableDemo2() //this is constructor
		{
			i=100;
			j=200;
			s="Hello";
			a=new Apple();
		}*/
		
		{//we can use non-static block or constructor to initialize non-static variables
			i=100;
			j=200;
			s="Hello";
			a=new Apple();
		}
		
		static
		{
			x=2222;
			s1="Bangalore";
			a1=new Apple();
		}
		
		public static void main(String[] args)
		{
			VariableDemo2 o = new VariableDemo2();
			
			System.out.println(o.i);
			System.out.println(o.j);
			System.out.println(o.s);
			System.out.println(o.a);
			System.out.println("----------------------------");
			
			VariableDemo2 o1 = new VariableDemo2();
			
			System.out.println(o1.i);
			System.out.println(o1.j);
			System.out.println(o1.s);
			System.out.println(o1.a);
			System.out.println("----------------------------");
			
			System.out.println(VariableDemo2.x);
			System.out.println(VariableDemo2.y);
			System.out.println(VariableDemo2.s1);
			System.out.println(VariableDemo2.a1);	
		}
}
