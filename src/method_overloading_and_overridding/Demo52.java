/* Program for method overloading and method overriding*/
package method_overloading_and_overridding;

class AAnimal
	{
		void speak()
		{
			System.out.println("Animal Speaking");
		}
		
		void disp(String name,int age)
		{
			System.out.println("Name=" + name +" "+" Age=" + age);
		}
		
		void disp(int age,String name) //overloading
		{
			System.out.println("Name=" + name +" "+" Age=" + age);
		}
	}

class MMammal extends AAnimal
	{
		void speak()//overriding
		{
			System.out.println("Mammal Speaking");
		}
	}

class DDog extends MMammal
	{
		void speak()//overriding
		{
			System.out.println("Bow bow");
		}
		
		void disp()//overloading
		{
			System.out.println("Scooby bow bow");
		}
	}

	class Demo52
		{
			public static void main(String[] args)
			{
				DDog d1=new DDog();
				d1.speak();
				d1.disp(2,"scooby");
				d1.disp("scrappy", 6);
				d1.disp();
			}
	}
