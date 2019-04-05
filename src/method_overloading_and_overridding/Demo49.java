/* Program for method overloading*/

package method_overloading_and_overridding;

class Demo49 
{
		void print()
		{
			System.out.println("print() method (no) args");	
		}
		
		/*boolean print()
		 {
		 	System.out.println("print() method (no) args boolean method return type");	
		 }
		 */
		
		String print(int i)
		{
			System.out.println("print() method one args");
			return "Success1";	
		}
		
		String print(int i,int j)
		{
			System.out.println("print() method one args");
			return "Success2";	
		}
		
		String print(long l, long m)
		{
			System.out.println("print() method one args");
			return "Success3";	
		}
		
		String print(String s,int i)
		{
			System.out.println("print() method one args");
			return "Success4";	
		}
		
		String print(int i,String s)
		{
			System.out.println("print() method one args");
			return "Success5";	
		}
		
		public static void main(String[] args)
		{
			String res;
			
			Demo49 d=new Demo49();
			d.print();
			
			res=d.print(555);
			System.out.println(res);
			
			res=d.print(123,456);
			System.out.println(res);
			
			res=d.print(100l,200l);
			System.out.println(res);
			
			res=d.print("Hello",10);
			System.out.println(res);
			
			res=d.print(10,"Hello");
			System.out.println(res);			
		}
}
