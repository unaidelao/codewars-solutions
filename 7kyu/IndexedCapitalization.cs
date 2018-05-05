/*
 * Indexed Capitalization kata - C#
 *
 * Given a string and an array of integers representing indices, capitalize all
 * letters at the given indices.
 *
 * For example:
 *    capitalize("abcdef",[1,2,5]) = "aBCdeF"
 *    capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
 *
 * The input will be a lowercase string with no spaces and an array of digits.
 *
 * @author Unai de la O
 */

using System;
using System.Collections.Generic;

public static class Kata
{
  public static string Capitalize(string s, List<int> idxs)
  {
    int[] arrLst = idxs.ToArray();
    char[] arrStr = s.ToCharArray();
    
    if (arrStr.Length >= arrLst.Length)
    {
      foreach (var x in arrLst)
      {
        if (arrStr.Length > x)
          arrStr[x] = Char.ToUpper(arrStr[x]);
      }
    }
    return new string(arrStr);
  }
}