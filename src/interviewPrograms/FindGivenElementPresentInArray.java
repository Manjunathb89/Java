package interviewPrograms;

import java.util.Scanner;

public class FindGivenElementPresentInArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
			Scanner sc = new Scanner(System.in);
			sc.nextInt();
			
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
