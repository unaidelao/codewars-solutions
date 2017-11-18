/**
 * Even or Odd kata - Java
 *
 * Create a function that takes an integer as an argument and returns "Even"
 * for even numbers or "Odd" for odd numbers.
 *
 * @author Unai de la O
 */

 public class EvenOrOddNumber {
   public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
 }
