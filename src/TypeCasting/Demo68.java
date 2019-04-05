/*Program for upcasting*/

package TypeCasting;

class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	
	void sleep()
	{
		System.out.println("Sleeping");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
	
	void Waltail()
	{
		System.out.println("Waging tail");
	}
}
public class Demo68 
{
	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		d1.eat();
		d1.sleep();
		
		d1.bark();
		d1.Waltail(); //can access its own and inherited method
		
		System.out.println("-------------------------------------");
		
		Animal a1= new Dog();
		a1.sleep();
		a1.eat();
		
		//a1.bark();
		//a1.Waltail(); //after upcasting ,cannot access its own method	
	}
}
