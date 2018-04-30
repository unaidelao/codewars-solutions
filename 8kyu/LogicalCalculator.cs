/*
 * Logical Calculator kata - C#
 *
 * Your task is to calculate logical value of boolean array. Test arrays are
 * one-dimensional and their size is in the range 1-50.
 *
 * Links referring to logical operations: AND, OR and XOR.
 *
 * You should begin at the first value, and repeatedly apply the logical
 * operation across the remaining elements in the array sequentially.
 *
 * Author: Unai de la O
 */

public class Kata
{
  public static bool LogicalCalc(bool[] array, string op)
  {
    if (op == "AND")
    {
      if (array.Length == 1)
      {
        return array[0];
      }
      else if (array.Length == 2)
      {
        return array[0] && array[1];
      }
      else
      {
        bool flag = array[0] && array[1];
        for (int i = 2; i < array.Length; i++)
          flag = flag && array[i];
        return flag;
      }
    }
    else if (op == "OR")
    {
      if (array.Length == 1)
      {
        return array[0];
      }
      else if (array.Length == 2)
      {
        return array[0] || array[1];
      }
      else
      {
        bool flag = array[0] || array[1];
        for (int i = 2; i < array.Length; i++)
          flag = flag || array[i];
        return flag;
      }
    }
    else if (op == "XOR")
    {
      if (array.Length == 1)
      {
        return array[0];
      }
      else if (array.Length == 2)
      {
        return array[0] ^ array[1];
      }
      else
      {
        bool flag = array[0] ^ array[1];
        for (int i = 2; i < array.Length; i++)
          flag = flag ^ array[i];
        return flag;
      }
    }
    return true;
  }
}