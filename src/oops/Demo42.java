package oops;
/* WAP to implement non-static method which initializes variables with passed value and returns the same value*/

class C
{
	int i,j;
	
	int getival(int a)
	{
		i=a;
		return i;
	}
	
	int getjval(int b)
	{
		return j=b;
	}
}

class Demo42
{
	public static void main(String[] args) 
	{
	  C c1 = new C();
	  System.out.println(c1.i);
	  
	  System.out.println(c1.getival(5555));
	  
	  int k=6666;
	  System.out.println(c1.getjval(k));
	}
}
