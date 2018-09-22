/**
 * Digital Root - Java
 * 
 * In this kata, you must create a digital root function.
 * 
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the
 * digits of n.
 * 
 * If that value has two digits, continue reducing in this way until a single-digit number is
 * produced. This is only applicable to the natural numbers.
 * 
 * @author Unai de la O
 */
public class DigitalRoot {
    public static int digital_root(int n) {
      return n < 10 ? n : digital_root(n % 10 + digital_root(n / 10));
    }
  }