/*Passing arguments to string array during run time*/

package practiceJava;

class Orange1
{
 	void test()
   	{
      	   System.out.println("I am orange");
   	}
}

class Demo1 
{
	public static void main(String[] args)
	{
	  Orange1 o1 =new Orange1();
	  o1.test();//1 way
	  new Orange1().test();//Object is created and method is called
	}
}



