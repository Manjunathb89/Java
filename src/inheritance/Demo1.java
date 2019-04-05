package inheritance;

class Aco
{
	Aco(String Name)
	{
		System.out.println("Const of parent class " + Name);
	}
}

class Bco extends Aco
{
	Bco(String Name)
	{
		super("Java");
		System.out.println("Const of child class " + Name);
	}
}

public class Demo1 {

	public static void main(String[] args) 
	{
		Bco bc1 = new Bco("Java");
		
		Aco ac= new Aco("Manju");

	}

}
