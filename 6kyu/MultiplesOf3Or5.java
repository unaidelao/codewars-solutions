/**
 * Multiples of 3 or 5 - Java
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9,
 * the sum of these multiples is 23.
 * 
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number
 * passed in.
 * 
 * @author Unai de la O
 */
public class Solution {
    
    public int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
            result += i;
            }
        }
        return result;
    }
  }