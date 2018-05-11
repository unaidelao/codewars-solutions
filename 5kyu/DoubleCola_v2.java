/**
 * Double Cola kata - Java
 *
 * @author Unai de la O
 * @version 2.0
 * Note: this version is less readable but much more efficient than my 1.0 v.
 */

public class Line {
  public static String WhoIsNext(String[] names, int n)
  {
    int persons = names.length;
    int turnRate = 1;
     
    while (n - persons > 0) {
      n -= persons;
      persons *= 2;
      turnRate *= 2;
    }
    return names[(n - 1) / turnRate];
  }
}