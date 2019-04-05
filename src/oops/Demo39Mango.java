/*Accessing static member present in another class*/

package oops;

class Demo39Mango 
	{
		static int i=10;
		
		static
		{
			
			System.out.println(i);
			print();
			i=5555;	
		}
		
		public static void main(String[] args)
		{
			System.out.println(Demo39Mango.i);
			System.out.println(kachhaMango.j);
		}
		
		static
		{
			i=6666;
		}
		
		static void print()
		{
			System.out.println("Hello");
		}
	
	}
	
class kachhaMango
	{
		static int j=100;
		
		static
		{
			j=1234;
		}
	}

