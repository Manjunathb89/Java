package objectClass;

class Pomegrante
{
	int wt;
	
	Pomegrante(int wt)
	{
		this.wt=wt;
	}
	
	public String toString()
	{
		return "wt=" +wt ;
	}
	
	public boolean equals(Object o)
	{
		if(o==null)
			return false; //To handel null pointer
		
		if(this==o)
			return true; //To handel same object value comparision
		
		//if(o instanceof Pomegrante) //To check whether it is comapring same object type or different
		//{
			if(o instanceof Pomegrante)
			this.wt=((Pomegrante)o).wt;
			//return true;
		//}			
		
			return false;
	}
}
class Demo84
{
	public static void main(String[] args) 
	{
		Pomegrante p1=new Pomegrante(250);
		Pomegrante p2=new Pomegrante(270);
		Pomegrante p3=new Pomegrante(250);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);		
		
		
		System.out.println(p1==p2);//it compars address
		System.out.println(p1==p3);
		
		System.out.println(p1.equals(p2)); //It comparing the value
		System.out.println(p1.equals(p3));	
		System.out.println("To handel null pointer "+ p1.equals(null));
		System.out.println("To handel same object value comparision "+p1.equals(p1));
		
		Pineapple pa1=new Pineapple(500);
		System.out.println(p1.equals(pa1));
	}
}
