/*Program for interger*/

package wrapperClasses;

public class Demo85 
{
	public static void main(String[] args) 
	{
		int i=100;
		System.out.println(i);
		
		Integer ii1=new Integer(100);//boxing , passing value
		System.out.println(ii1);
		
		Integer ii2=new Integer(i);//boxing, passing variable
		System.out.println(ii2);
		
		Integer ii3=new Integer("100");//passing string
		System.out.println(ii3);
		
		Integer ii4=100;
		System.out.println(ii4);//boxing 100 is wrapped object
	}
}
