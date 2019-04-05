package practiceJava;
class Demo3
{
	public static void main(String[] args)
	{
		int i=10;
		int j;
		System.out.println("i"); //string
		System.out.println('i'); //char
		System.out.println(i); // variable
		System.out.println(10); // value
		System.out.println("10"); // String
		System.out.println("true"); // String
		System.out.println("j=20");
		System.out.println(j=20);
		System.out.println(true); // boolean
		//System.out.println(True); // Considered it as variable but not declared hence cte
		
		String name = "Manjunath";
		int age = 28;
		
		System.out.println("My name is  " + name + "age is " + age);
		
		char ch = '6';
		System.out.println(ch);
		
		ch = 0; //assigns char equivalent to 0 unicode value
		System.out.println(ch);
		
		ch = 6;
		System.out.println(ch);
		
		ch = '\u0020'; //Ti is hexadecimal equivalent to 0 
		System.out.println(ch);
		
		//ch = ''; //cte - we cannot have '' without any char
		
		System.out.println("End");
	}
}