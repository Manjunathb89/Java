package arrays_Interview_Programs;
import java.util.Scanner;

public class FindGivenElementPresentInArray 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5];

		for(int i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
			 boolean res = isPresent(arr,4);
			 if(res)
				 System.out.println("present");
			 else
				 System.out.println("Not present");
	}
	
	public static boolean isPresent(int [] arr, int ele)
	{
		boolean flag = false;
		{
			for (int i=0; i<=arr.length-1;i++)
			{
				if(arr[i]==ele)
				{
					flag = true;
					break;
				}
			}
			return flag;
		}
	}
}
