package oops;

class Demo40
{
  int i, j;
  
  public static void main(String args[])
  {
	  Demo40 d1 =new Demo40();
	  System.out.println(d1.i);
	  System.out.println(d1.j);
	  
	  Demo40 d2 =new Demo40();
	  System.out.println(d2.i);
	  System.out.println(d2.j);
	  
	  System.out.println(new Demo40());//executes iib and present address
	  
	  System.out.println(new Demo40().i);//new object
	  System.out.println(new Demo40().j);//new object
	  
	  d2.i=123;
	  d2.j=456;
	  System.out.println(d1.i);
	  System.out.println(d1.j);
	  System.out.println(d2.i);
	  System.out.println(d2.j);
  }
  
  {
	  System.out.println("IIB1");
	  i=20;
	  j=30;
  }
  
  {
	  System.out.println("IIB2");
	  i=200;
	  j=300;
	  {i=222;j=333;}
  }
	
}
