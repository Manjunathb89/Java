package oops;

class Demo36 
{
	static int i=10;
	
	public static void main(String[] args)
	{
		System.out.println("i=" +i);
		
		i=20;
		System.out.println("i=" +i);
		i=30;
		System.out.println("i=" +i);
		
		int i=400;
		System.out.println("i=" +i);
		i=500;
		System.out.println("i=" +i);
		
		//to print static i value , we should call it, className.variableName
		System.out.println("i=" +Demo36.i);
		System.out.println("----------------------------------");
		
		{  //statement block
			int j=100; //local variable within statement block
			
			System.out.println("i=" +i); //local variable i 
			System.out.println("i=" +Demo36.i);//static i value
			System.out.println("j=" +j);
		}
		
		//System.out.println(j); //out of scope, not accessible...since j is inside statement block  
	}
}
