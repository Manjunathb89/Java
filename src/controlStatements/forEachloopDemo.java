package controlStatements;

public class forEachloopDemo 
{
	public static void main (String[] argss)
	{
		
		System.out.println("-------------int type array-------------------------------");
		int marks[]= {70,90,60,30,75};
		for(int i=0;i<5;i++)
			System.out.println(marks[i]);
		
		System.out.println("------Using For each-----------");
		
		for(int mark:marks)
			System.out.println(mark);
		
		System.out.println("------------float type array-------------------------------");
		
		
		float tempratures[] = {28.7f,32.1f,21.6f,22.4f};
		for(int i=0;i<4;i++)
			System.out.println(tempratures[i]);
		
		System.out.println("------Using For each-----------");
		
		for(float temp:tempratures)
			System.out.println(temp);
		
		System.out.println("-------------String type array-------------------------------");
		
		String names[]= {"Krushi","Thanvi","Brundha","pratham",};
		for(int i=0;i<4;i++)
		    System.out.println(names[i]);
		
		System.out.println("------Using For each-----------");
		
		for(String name:names)
			System.out.println(name);
			
		System.out.println("-------------String type array-------------------------------");
		
		    Apple a1 = new Apple();
			Apple Apples[]	= {new Apple(),new Apple(),new Apple(),a1};
			for(int i=0;i<4;i++)
			    System.out.println(Apples[i]);
			
		System.out.println("------Using For each-----------");
		  
		for(Apple A:Apples)
			 System.out.println(A);
			
	}
}
class Apple
{

}

