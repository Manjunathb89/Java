package wrapperClasses;

class StringType 
{
	public static void main(String[] args) 
	{
		int i=100;
		Long l1=new Long(i);
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
				
				Integer ii4=new Integer(123);
				Integer ii5=ii4;
				System.out.println(ii5==ii4);
				
				Integer ii6=Integer.valueOf(100);
				
	}
}
