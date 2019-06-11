import java.util.stream.IntStream;

/**
 * Array plus array - Java
 * 
 * I'm new to coding and now I want to get the sum of two arrays...actually the
 * sum of all their elements. I'll appreciate for your help.
 * 
 * P.S. Each array includes only integer numbers. Output is a number too.
 * 
 * @author Unai de la O
 */
public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
