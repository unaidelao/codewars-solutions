/**
 * Sum Of Positive - Java
 * 
 * You get an array of numbers, return the sum of all of the positives ones.
 * 
 * @author Unai de la O
 */
public class SumOfPositive{

    public static int sum(int[] arr){
        int sum = 0;
        for (int num : arr) {
            if (num > 0) sum +=  num;
        }
        return sum;
    }
  
}