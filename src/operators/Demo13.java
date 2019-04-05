package operators;



class Demo13 
{
	
 static Orange o1;
 public static void main(String...args)
 {
	 System.out.println(o1);
	 System.out.println(o1 instanceof Orange);
	 
	 o1=new Orange();
	 System.out.println(o1 instanceof Orange);
	 
	 o1=null;
	 System.out.println(o1 instanceof Orange);
	 
	 String s = new String ("Hello");
	  if(s instanceof String)
		 System.out.println("s is instanceof string class");
	 
	 s = null;
	 if((!(s instanceof String)))
		 System.out.println("s is not instanceof string class");
 }
}
