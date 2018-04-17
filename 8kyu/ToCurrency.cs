/*
 * To Currency Kata - C#
 *
 * Write a function that takes an integer in input and outputs a string with
 * currency format.
 *
 * Integer in currency format is expressed by a string of number where every
 * three characters are separated by comma.
 *
 * Author: Unai de la O
 */
 
using System;

public class Kata
{
  public static string ToCurrency(int price)
  {
    return string.Format("{0:N0}", price);
  }
}