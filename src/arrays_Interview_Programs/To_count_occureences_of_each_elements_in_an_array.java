package arrays_Interview_Programs;
import java.util.Arrays;
import java.util.HashMap; 

public class To_count_occureences_of_each_elements_in_an_array 
{  
    static void arrayElementCount(int inputArray[])
    {
        //Creating a HashMap object with elements of inputArray as keys and their count as values  
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
          
        //checking every element of the inputArray 
        for (int i : inputArray) 
        {
            if(elementCountMap.containsKey(i))
            {
                //If element is present in elementCountMap, incrementing it's count by 1 
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If element is not present in elementCountMap, 
                //adding this element to elementCountMap with 1 as it's value  
                elementCountMap.put(i, 1);
            }
        }
        System.out.println("Input Array : "+Arrays.toString(inputArray));
        System.out.println("Element Count : "+elementCountMap);
    }
      
    public static void main(String[] args) 
    {    
        arrayElementCount(new int[]{4, 5, 4, 5, 4, 6});
        arrayElementCount(new int[]{12, 9, 12, 9, 10, 9, 10, 11});
    }    
}