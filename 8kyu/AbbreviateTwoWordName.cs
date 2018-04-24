/*
 * Abbreviate a Two Word Name kata - C#
 *
 * Write a function to convert a name into initials. This kata strictly takes
 * two words with one space in between them.
 *
 * The output should be two capital letters with a dot seperating them.
 *
 * It should look like this:
 *     Sam Harris => S.H
 *     Patrick Feeney => P.F
 *
 * Author: Unai de la O
 */

using System;

public class AbbreviateTwoWordName
{
  public static string AbbrevName(string name)
  {
    string[] nameArr = name.Split(' ');
    return String.Format("{0}.{1}"
                         ,nameArr[0].Substring(0,1).ToUpper()
                         ,nameArr[1].Substring(0,1).ToUpper());
  }
}