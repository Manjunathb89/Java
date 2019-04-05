package oops;
/*
Access Static members present in different class
 */
public class A 
{
	int i;
	public static void main(String[] args) 
	{
		
		//System.out.println(i);//not possible
		System.out.println(Demo37.i);//possible
		
		//test(); //not possible
		Demo37.test();//possible
	}

}
