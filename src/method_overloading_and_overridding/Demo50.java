/* Program for method overriding*/

package method_overloading_and_overridding;

class Animal 
{
	void speak()
	{
		System.out.println("Animal Speaking");
	}
}

class Mammal extends Animal
{
	void speak()
	{
		System.out.println("Mammal Speaking");
	}
}

class Dog extends Mammal
{
	void speak()
	{
		System.out.println("Bow bow");
	}
}

class Demo50 
	{
		public static void main(String[] args)
		{
			Animal a1=new Animal();
			a1.speak();
			
			Mammal m1=new Mammal();
			m1.speak();
			
			Dog d1=new Dog();
			d1.speak();
		}
}
