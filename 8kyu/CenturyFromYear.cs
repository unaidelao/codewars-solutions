/*
 * Century From Year kata - C#
 *
 * Given a year, return the century it is in.
 *
 * Author: Unai de la O
 */
 
using System;

public static class Kata
{
  public static int СenturyFromYear(int year)
  {
    return year % 100 > 0 ? year / 100 + 1 : year / 100;
  }
}