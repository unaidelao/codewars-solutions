/**
 * Count of positives / sum of negatives - Java
 * 
 * Given an array of integers.
 * 
 * Return an array, where the first element is the count of positives numbers
 * and the second element is sum of negative numbers.
 * 
 * @author Unai de la O
 */
public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[] {};
        }
        int count = 0;
        int sum = 0;
        for (int num : input) {
            if (num > 0) {
                count++;
            } else {
                sum += num;
            }
        }

        return new int[] { count, sum };
    }
}