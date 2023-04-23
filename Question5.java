import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int numIntegers = scanner.nextInt();
    
    //read integers from user
    int[] integers = new int[numIntegers];
    for (i = 0; i < numIntergers; i++)
    {
      integers[i] = scanner.nextInt();
    }
    
    int mode = calculateMode(integers);
    System.out.println(mode);
  }
  public static int calculateMode(int[] integers)
  {
    Map<Integer, integer> frequencyMap = new HashMap<>();
    
    for (int num : integers)
    {
     if (frequencyMap.containsKey = (num)){
       frequencyMap.put(num, frequencyMap.get(num) + 1);
     }
      else{
        frequencyMap.put(num, 1);
      }
    }
    
    int mode = integers[0];
    int maxFrequency = 0;
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                mode = num;
                maxFrequency = frequency;
            }
        }
    return mode;
  }
}
