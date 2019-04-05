package wrapperClasses;

public class DoubleType
{
		public static void main(String[] args) 
		{
			int i=100;
			Integer ii=new Integer(i);//boxing operation 
			System.out.println(ii);
			
			//double to int type
			double d =ii.doubleValue();
			System.out.println(d);	
			
			//1 way ----double to Double type
			Double dd =new Double(d);//boxing
			System.out.println(dd);
			
			//2 way ---double to Double type
			Double dd1 =new Double("12.56");//boxing
			System.out.println(dd1);
			
			//3way--
			Double dd2=d;//boxing
			System.out.println(dd2);
			
			System.out.println("unboxing -----double to int type-----");
			int i1=dd2.intValue();//unboxing and Narrowing
			System.out.println(i1);
			
			int i2=(int)dd2.doubleValue();
			System.out.println(i2);
		}
}
