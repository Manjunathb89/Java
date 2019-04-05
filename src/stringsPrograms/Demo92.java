/*Demo on string Buffer and string builder*/

package stringsPrograms;

public class Demo92 
{
	public static void main(String[] args) 
	{
	StringBuffer sb1=new StringBuffer();
	//sb1="Hello"; // Not possible since "" double quotes belongs to string class i.e. like assigning string class to object
	
	//who do you convert string to string buffer, 2 ways append method and pass string as arugument to string builder construtcor 
	sb1.append("Hello");//append method
	
	StringBuffer sb2=new StringBuffer("Bangalore");//pass string as arugument to string builder construtcor 
	
	System.out.println(sb1 + " " +sb2);
	
	System.out.println(sb1.reverse());//updates the existing object
	
	System.out.println(sb1);
	
	System.out.println(sb1.reverse());
	System.out.println(sb1.reverse());
	
	StringBuffer sb3= sb2.reverse();
	
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println(sb3);
	
	System.out.println(sb2==sb3);
	
	System.out.println("--------------------------------------------------");
	
	StringBuffer sb4=new StringBuffer("I love you java");
	String str1=sb4.delete(7,11).toString();
	System.out.println(str1);
	
	StringBuffer sb5=new StringBuffer("I love you ajava");
	String str2=sb5.deleteCharAt(11).toString();
	System.out.println(str2);      
	
	sb4=new StringBuffer();
	System.out.println(sb4.length());
	
	
	System.out.println("--------------------------------------------------");
	
	sb4.setLength(0);
   	System.out.println(sb4);
   	
   	sb4.append("JavaDeveloper");
   	System.out.println(sb4);//JavaDeveloper
   	
	sb4.insert(4, "haha");
	System.out.println(sb4);//JavahahaDeveloper
	
     //to insert at the end
     sb4.insert(sb4.length(), "huhu");
     System.out.println(sb4);//JavahahaDeveloperhuhu
       
      //to insert at the beginning
      sb4.insert(0, "huhu");
      System.out.println(sb4); //huhuJavahahaDeveloperhuhu
  
       sb4.delete(4, 6);
       System.out.println(sb4);//huhuvahahaDeveloperhuhu
	   System.out.println(sb4.deleteCharAt(4));//5th char 'h' is deleted  //huhuahahaDeveloperhuhu
	   
	    StringBuilder sb6=new StringBuilder("Selenium");
		System.out.println(sb6);
		
		StringBuilder sbl;
		System.out.println(sbl=sb6.insert(4, "Haha"));
		System.out.println(sb6);
		
		System.out.println("-------------------------------------");
		System.out.println(sb6==sbl);
		System.out.println(sb6.equals(sbl));//true
		
		StringBuilder sbl2=new StringBuilder("Hello");
		StringBuilder sbl3=new StringBuilder("Hello");
		System.out.println(sbl2.equals(sbl3)); //equals method not overridden compares address

		//String s=sb1  //not possible since they are of diff class
		
		//assiging StringBuffer content to String class	
		String s=sb1.toString();

		//assiging String to StringBuffer class
		StringBuffer sb7=new StringBuffer("Hello");//1st way
		sb7.append("Bangalore");//2nd way	
		} 
}
