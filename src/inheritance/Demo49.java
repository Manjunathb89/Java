package inheritance;
/*Program for, User defined constructor in super class and No argument constructor in sub class
Inheritance of class with constructor (String argument constructor */
class x
{
	x(String s)
	{
		
	}
}

class y extends x
{
	y()
	{
		super("Hello");	
	}
}

class Demo49 
{
	public static void main(String[] args)
	{
		x x1=new x("Hello");
		y y1=new y();	
	}
}
