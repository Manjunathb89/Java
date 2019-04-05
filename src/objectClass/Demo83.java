package objectClass;

class Pineapple
{
	int wt;
	
	Pineapple(int wt)
	{
		this.wt=wt;
	}
	
	public String toString()
	{
		return "wt=" +wt ;
	}
}
class Demo83 
{
	public static void main(String[] args) 
	{
		Pineapple p1=new Pineapple(500);
		Pineapple p2=new Pineapple(520);
		Pineapple p3=new Pineapple(500);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);		
		
		
		System.out.println(p1==p2);//it compars address
		System.out.println(p1==p3);
		
		p1=p3;
		System.out.println(p1.equals(p2)); //It comparing the value
		System.out.println(p1.equals(p3));	
	}
}
