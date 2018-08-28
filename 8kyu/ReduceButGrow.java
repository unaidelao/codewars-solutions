/**
 * Reduce but grow - Java
 *
 * Given and array of integers (x), return the result of multiplying the values together in order.
 *
 * @author Unai de la O
 */
public class ReduceButGrow{

    public static int grow(int[] x){
      int result = 1;
      for (int number : x) {
        result *= number;
      }
      return result;
    }
  }