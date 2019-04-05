/*Access Non-static members(variables and methods) in same class*/

package oops;

class NonstaticVariableMethod
{
	int i=100;
	public static void main(String[] args)
	{	
		NonstaticVariableMethod O1 =new NonstaticVariableMethod();
		
		O1.print();	
		O1.add(4, 6);
		O1.i=200;
		O1.print();	
		
		new NonstaticVariableMethod().print(); 
		
		new NonstaticVariableMethod().i=200;
		
		new NonstaticVariableMethod().print(); 
	}
	
	int add(int n1, int n2)
	{
		int res = n1+n2;
		System.out.println(res);
		return res;
	}
	
	void print()
	{
		System.out.println("i=" + i);
	}

}
