package practiceJava;


class MOrange
{

}

class Demo5
{

  static int i;
  static boolean bln;
  static char ch;
  static MOrange a1;

  	public static void main(String... args)
      {
	 	System.out.println(i);
	 	System.out.println(ch);
	 	System.out.println(bln);
	
	 	System.out.println(a1);
	 	a1=new MOrange();
	 	System.out.println(a1);
	 	a1 = null;
	 	System.out.println(a1);
      }

}