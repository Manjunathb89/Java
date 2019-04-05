package TypeCasting;


class A
{
	
}

class B extends A
{
	
}

class C extends B
{
	
}

class Demo69
{
	public static void main(String[] args)
	{
		A a1=new A();//Normal object creation
		B b1=new B();
		C c1=new C();
		
		System.out.println("--------------------------------");
		
		A a2=a1;//No object created but a2 referce to same object as a1
		B b2=b1;
		C c2=c1;
		
		System.out.println("--------------------------------");
		
		B b3=new C();//Auto upcasting
		A a3=new B();
		A a4=new C();
		
		System.out.println("--------------------------------");
	
		
		//B b4= new A();// direct downcasting of a super class object cte imcompatiable type
		//C c4=new B();
		
		System.out.println("--------------------------------");
		
		B b4=(B)new A();//Explict casting of a super class object will be complie but generate class cast exception during execution 
		C c4=(C)new B();
		
		System.out.println("--------------------------------");
		
		B b5=(B)a3;
		C c5=(C)b3;
		B b6=(B)a4;
		C c6=(C)a4;		
	}
}
