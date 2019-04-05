package oops;
/*Program for single and No argument constructor */
class G
{
	int i;
	
	G(int a) //Single argument constructor 
	{
		i=a;
	}
	
	G()// No argument constructor
	{
		i=123;
	}	
}

class Demo46
{
	public static void main(String[] args)
	{
		G g1=new G(100);
		System.out.println(g1.i);//int argument constructor is called 
		
		G g2=new G();
		System.out.println(g2.i);//NO argument constructor is called 
		
		G g3=new G(200);
		System.out.println(g3.i);//int argument constructor is called 
		
		G g4=new G();
		System.out.println(g4.i);//NO argument constructor is called 
		
		g2.i=567;
		System.out.println(g2.i);
		
		System.out.println(g1.i);//100
	}
}
