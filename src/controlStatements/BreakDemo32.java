package controlStatements;

class BreakDemo32 {

	public static void main(String[] args) 
	{
		int i=1;
		while(true)
		{
			System.out.println(i++);// prints 1 - 99
			if(i==100)
			break;
		}
	}
}
