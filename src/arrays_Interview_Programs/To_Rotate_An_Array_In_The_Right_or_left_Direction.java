package arrays_Interview_Programs;
import java.util.Arrays;

public class To_Rotate_An_Array_In_The_Right_or_left_Direction 
{
	private static void rightRotate(int[] inputArray, int n)
    {
        System.out.println("Input Array Before Rotation :");
         
        System.out.println(Arrays.toString(inputArray));
         
        int temp;
         
        for (int i = 1; i <= n; i++) 
        { 
            temp = inputArray[inputArray.length-1]; 
             
            for (int j = inputArray.length-1; j > 0; j--) 
            {
                inputArray[j] = inputArray[j-1];
            }
             
            inputArray[0] = temp;
        }
         
        System.out.println("Input Array After Right Rotation By "+n+" Positions :");
         
        System.out.println(Arrays.toString(inputArray));
    }
	
	private static void leftRotate(int[] inputArray, int n) 
    {
        System.out.println("Input Array Before Rotation :");
         
        System.out.println(Arrays.toString(inputArray));
         
        int temp;
         
        for (int i = 0; i < n; i++)
        {
            temp = inputArray[0];
             
            for (int j = 0; j < inputArray.length-1; j++) 
            {
                inputArray[j] = inputArray[j+1];
            }
             
            inputArray[inputArray.length - 1] = temp;
        }
         
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");
         
        System.out.println(Arrays.toString(inputArray));
    }
     
    public static void main(String[] args) 
    {
        rightRotate(new int[] {1,2,3,4,5,6,7}, 2);
        
        leftRotate(new int[] {1,2,3,4,5,6,7}, 2);
    }
}
