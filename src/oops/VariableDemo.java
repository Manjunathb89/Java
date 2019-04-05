package oops;

class VariableDemo 
{
	static int a =100; //static variable /class variable
		   int b= 200; //non static variable/instance variable
		   
	public static void main(String[] args) 
	{
		int i=10;//local variable
		{
			//statement block
			int j=20; //local variable 
		}
	}
 
	int add(int n1, int n2)//n1 and n2 method parameters
	{
		return n1+n2;
	}
}
