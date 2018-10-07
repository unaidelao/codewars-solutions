import java.util.Arrays;
/**
 * Find the odd int - Java
 * 
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * 
 * @author Unai de la O
 */
public class FindOdd {
	public static int findIt(int[] a) {
        int finalResult = 0;
  	    int tempResult = 0;
        int counter = 0;
    
        for (int i = 0; i < a.length; i++) {
            tempResult = a[i];

            for (int j = 0; j < a.length; j++) {
                if (a[j] == tempResult) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                finalResult = tempResult;
            }
      
            counter = 0;
        }

        return finalResult;
    }
}