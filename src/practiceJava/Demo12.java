package practiceJava;

import operators.Orange;

class Demo12
{
	public static void main(String[] args)
	{
		int x=5, y=8;
		System.out.println(x==y);//false
		System.out.println(x==10);//false
		System.out.println(10==10);//true

		Orange o1 = new Orange();
		System.out.println(o1); //prints address of o1
		
		Orange o2 = new Orange();
		System.out.println(o2); //prints address of o2

		System.out.println(o1==o2); //false
		System.out.println(o1!=o2); //true
		//System.out.println(o1<o2);
		//System.out.println(o1>o2);
		//System.out.println(o1<=o2);
		//System.out.println(o1>=o2);
		
		o1=o2; //o2 address is assigned to o1
		System.out.println(o1==o2); //true

		o1=null;
		o2=null;
		System.out.println(o1==o2);//true
		System.out.println(o1==null);//true
		System.out.println(null==o1);//true
		System.out.println(null==null);//true
		System.out.println(o1=new Orange());//address of newly created object is assigned to o1
		System.out.println(o1==new Orange());//false new object is created with different address with is not same o1 address.

	}
}

