/**
 * Filtering even numbers (Bug fixes) - Java
 *
 * The method is supposed to remove even numbers from the list and return a
 * list that contains odd number. However, there is a bug in the method that
 * needs to be resolved.
 *
 * @author Unai de la O
 */

import java.util.List;

public class FilteringEvenNumbers1 {
  public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
  {
    for (int i = 0; i < listOfNumbers.size(); i++)
    {
      if (listOfNumbers.get(i)%2 == 0)
      {
        listOfNumbers.remove(i);
        i--;
      }
    }
    return listOfNumbers;
  }
}
