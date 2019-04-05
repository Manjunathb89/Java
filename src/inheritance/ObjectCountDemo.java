package inheritance;
/*Program to count Number of objects*/
class Apple
{
	static int cnt=0;
	
	Apple()
	{
		cnt++;
	}
}
class ObjectCountDemo 
{
	public static void main(String[] args) 
	{
		Apple x=new Apple();
				new Apple();
		Apple a=new Apple();
				new Apple();
		
		System.out.println("NO of objects created is " + Apple.cnt);
	}
}
