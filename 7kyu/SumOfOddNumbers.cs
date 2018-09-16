/*
    Sum of odd numbers - C#

    Given the triangle of consecutive odd numbers, Calculate the row sums of this triangle from the
    row index (starting at index 1).

    Author: Unai de la O
 */
 
using System;

public static class Kata
{
  public static long rowSumOddNumbers(long n)
  {
    return (long) Math.Pow(n, 3);
  }
}