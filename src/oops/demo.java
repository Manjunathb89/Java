package oops;
/*
 Difference in Access Static and Non-static Members
 */
class demo
{
	int i=10; //non static
	static int k=20;
	
	 void print() // non static method
	 	{
		 	System.out.println(i); //Non-static variable can be called directly in no static method
		 	System.out.println(k); //static variable can also be called directly in no static method
	 	}
	
	public static void main(String[] args)
		 {
			demo d =new demo();
			d.print();  //In static method non-static method variable can be called using ref var 
			
			System.out.println(d.i); //In static method non-static variable can be called using ref var 
		 }
		
	
	 static void disp() //static method
	 {
	 	System.out.println(k); //In static method static variable can be called directly 
	 }
}
