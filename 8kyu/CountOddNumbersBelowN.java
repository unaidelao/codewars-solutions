/**
 * Count odd numbers below n - Java
 * 
 * Given a number n, return the number of positive odd numbers below n.
 * 
 * @author Unai de la O
 */
public class CountOddNumbersBelowN {
    
    public static int oddCount(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                result++;
        }
        return result;
    }
}