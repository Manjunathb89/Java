package wrapperClasses;

class LongType 
{
	public static void main(String[] args) 
	{
		int i=100;
		byte b=123;
		Long l1=new Long(i);
		System.out.println(l1);
		
		Long l2=new Long(b);
		System.out.println(l2);
			
		long l=100;
		Byte bb=new Byte((byte)l); 
		System.out.println(bb);
	}
}
