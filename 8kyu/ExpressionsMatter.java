import java.util.Arrays;

/**
 * Expressions Matter - Java
 *
 * Given three integers a ,b ,c, return the largest number obtained after
 * inserting the following operators and brackets: +, *, ().
 *
 * @author Unai de la O
 */
public class ExpressionsMatter {

    public static int expressionsMatter(int a, int b, int c) {
        int case1 = a * (b + c);
        int case2 = (a + b) * c;
        int case3 = a * b * c;
        int case4 = a + b + c;

        int[] arr = { case1, case2, case3, case4 };
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
}
