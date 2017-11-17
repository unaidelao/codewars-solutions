/*
 * Even or Odd kata - C#
 *
 * Create a function that takes an integer as an argument and returns "Even"
 * for even numbers or "Odd" for odd numbers.
 *
 * Author: Unai de la O
 */

 using System;

 public class EvenOrOddNumber
 {
   public static string EvenOrOdd(int number)
   {
     return (number % 2 == 0) ? "Even" : "Odd";
   }
 }
