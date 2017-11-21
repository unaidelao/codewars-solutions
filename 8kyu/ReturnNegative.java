/**
 * Return negative kata - Java
 *
 * In this simple assignment you are given a number and have to make it
 * negative. But maybe the number is already negative?
 *
 * Example:
 *
 * ReturnNegative.MakeNegative(1); // return -1
 * ReturnNegative.MakeNegative(-5); // return -5
 * ReturnNegative.MakeNegative(0); // return 0
 *
 * Notes:
 * The number can be negative already, in which case no change is required.
 * Zero (0) can't be negative, see examples above.
 *
 * @author Unai de la O
 */
 public class ReturnNegative {
   public static int makeNegative(final int x) {
     return -Math.abs(x);
   }
 }
