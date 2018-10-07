/**
 * Find the parity outlier - Java
 * 
 * You are given an array (which will have a length of at least 3, but could be very large)
 * containing integers. The array is either entirely comprised of odd integers or entirely
 * comprised of even integers except for a single integer N. Write a method that takes the array
 * as an argument and returns this "outlier" N.
 * 
 * @author Unai de la O
 */
public class FindOutlier{
    static int find(int[] integers){
        boolean even = detectEven(integers);
      
        if (even) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            }
        }
        else {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    return integers[i];
                }
            }
        }
      
        return 0;
    }
    
    static boolean detectEven(int[] arr) {
        return (arr[0]%2==0) && (arr[1]%2==0) ? true : (arr[2]%2==0) ? true : false;
    }
}