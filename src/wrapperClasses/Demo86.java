package wrapperClasses;

class Demo86 
{
	public static void main(String[] args) 
	{
		int i=100;
		Integer ii=new Integer(i);//boxing operation 
		System.out.println(ii);
		
		int j=ii.intValue();//unboxing operation
		System.out.println(j);
		
		System.out.println("------double primtive to Double Type--------------");
		
		//double to int type
		double d =ii.doubleValue();
		System.out.println(d);	
		
		//1 way ----double to Double type
		Double dd =new Double(d);//boxing
		System.out.println(dd);
		
		//2 way ---double to Double type
		Double dd1 =new Double("12.56");//boxing
		System.out.println(dd1);
		
		//3way--
		Double dd2=d;//boxing
		System.out.println(dd2);
		
		System.out.println("unboxing -----double to int type-----");
		int i1=dd2.intValue();//unboxing and Narrowing
		System.out.println(i1);
		
		int i2=(int)dd2.doubleValue();
		System.out.println(i2);
	
		System.out.println("--------------- Long Type--------------------------------------------");
		
		byte b=123;
		Long l1=new Long(i);
		System.out.println(l1);
		
		Long l2=new Long(b);
		System.out.println(l2);
			
		long l=100;
		Byte bb=new Byte((byte)l); 
		System.out.println(bb);

		System.out.println("--------------- character Type--------------------------------------------");
		
		Character ch=new Character('A');
		System.out.println(ch);
		
		ch=new Character((char)100);
		System.out.println(ch);
		
		Character ch2='B';
		char ch3=ch2.charValue();
		System.out.println(ch3);
		char ch4=ch2;
		
		System.out.println("--------------- String Type--------------------------------------------");
		
		String sss1=l1.toString();
		System.out.println(sss1);
		
		Double dd4=new Double(100);
		String s=dd4.toString();//object to String
		
		Double.toString(10.22);
		Long.toString(100L);
		Byte.toString((byte)100);
		
		//Add two string containing number and put in another String
		String s11="123";
		String s22="456";
		String s33=Integer.toString(Integer.parseInt(s11)+Integer.parseInt(s22));
		System.out.println(s33);
		
		//Add two string containing double value and put in another String
		String s1="123.123";
		String s2="456.456";
		String s3=Double.toString(Double.parseDouble(s11)+Double.parseDouble(s22));
		System.out.println(s3);
		
		Integer ii4=new Integer(123);//boxing operation 
		Integer ii5=ii4;
		System.out.println(ii4==ii5);//true
		
		Integer ii6=Integer.valueOf(100);//returning an new Integer object
		System.out.println(ii4==ii6);
	}
}
