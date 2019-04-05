package practiceJava;

class Demo11
{
	public static void main (String[] args)
	{
		int x = 5, y = 10;
		boolean res = x==y;
		System.out.println(res);
		System.out.println(x=y);
		System.out.println(x==10);
		System.out.println(5==10);
		System.out.println(true);
		
		System.out.println(x!=y);
		res = x!=y;
		System.out.println(res);

		//System.out.println('res'); CTE
		System.out.println("res");

		res = x>y;
		System.out.println(res);

		res = x<y;
		System.out.println(res);

		res = x<=y;
		System.out.println(res);

		res = x>=y;
		System.out.println(res);

		System.out.println(x=10);
		System.out.println(x==10);
		
		x=123;
		System.out.println("x=" + x);
		
		System.out.println(true);
		//System.out.println(True); CTE
		int True = 15;
		System.out.println(True);
		System.out.println("true");
		
		System.out.println(100);

	//Different ways of declaration
		int a=100, b=100, c=100;
		System.out.println("a="+a+" b="+b+" c="+c);

		int i,j,k;
		i=j=k=200;//works
		System.out.println("i="+i+" j="+j+" k="+k);
		
		//int h=100, i=h, j=h; 
		//int i=j=k=2100;
		
		int l,m,n;
		//l=10, m=20, n=30; // not possiable
		l=10; m=20; n=30; //works
		System.out.println("l="+l+" m="+m+" n="+n);

		//we can also have
		// orange o1,o2=new orange(),o3,o4=new orange();
		//orange o1=new orange(),o2,o3;
		//o2,o3=new orange();
		
	}

}
class orange{}