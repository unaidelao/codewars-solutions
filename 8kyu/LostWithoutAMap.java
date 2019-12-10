import java.util.Arrays;

/*
 * Lost Without a Map - Java
 *
 * Given an array of integers, return a new array with each value doubled.
 * 
 * @author Unai de la O
 */
public class Maps {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(n -> n * 2).toArray();
    }
}