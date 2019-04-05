package practiceJava;
class Demo10
{
	public static void main(String... pinki)
	{
 	  int i=2,j=3,k=4,l=25,m=7;
	  i+=5;
      j*=6;
	  k/=2;
	  l-=10;
	  m%=5;
	  System.out.println(i); //7
	  System.out.println(j); //18
	  System.out.println(k); //2
	  System.out.println(l); //15
	  System.out.println(m); //2
	
	  int a=4;
	  a*=5; //is same as a=a*5;// a=20
	  a*=5+4;//right side first and then assignement or compound assignement a=a*9
	  System.out.println(a);//a=180

	  a=4;
	  a=(a*5)+4;//this is different
	  System.out.println(a);

	  a=4;
	  a*=2+5*4;//a=a*2+5*4 = 88 first right side with precedence + and then compound assignement 
	  System.out.println(a);

	 int x;
	 x = 10+2*5/4;
  	 System.out.println(x); //12
	
     x = 10+4*(5/4);
  	 System.out.println(x); //14
         
 	 x = (10+4)*5/2;
  	 System.out.println(x); //35
	}

}