package interviewPrograms;
public class GCDorHCF 
{
	public static void main(String[] args)
	{
		System.out.println(gcd(20,6));
	}
	public static int gcd(int a,int b)
	{
		if(b!=0)
			return gcd(b,a%b);
		else
			return a;			
	}
}
