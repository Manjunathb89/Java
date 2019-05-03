//Different ways of calling methods from main method

package methods;

class Demo19 
{

	public static void main(String[] args) 
	{
		 print();
		 
		//1st way
		int total =add(10,20);
		System.out.println("_____________");
        System.out.println("Sum is " + total);
        
        //2nd way
        System.out.println("_____________");
        System.out.println(add(300,200));
        
        //3rd way
        System.out.println("_____________");
        add(35,60); //output will be lost her
        
        //4th way output of 1 method will act input of another method
        System.out.println(add(add(300,200), add(300,100)));
        
        int x=111, y=222;
        System.out.println(add(x,y));
        
        String S = wish("Manjunath");
        System.out.println(S);
        System.out.println(wish("Manjunath Basavaraju"));
	}
	///---------------------------------
	static void print()
		{
			System.out.println("I Love Java and Selenium");
		}
   
	//---------------------------------
	static int add(int n1, int n2)
		{
			int total =n1 + n2;
			return total;
		}
	
	//---------------------------------
	
	static String wish (String name)
	{
		return "Hello " + name;
	}
	
	//---------------------------------
	
}

