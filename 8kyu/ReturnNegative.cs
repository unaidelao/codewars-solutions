/*
 * Return negative kata - C#
 *
 * In this simple assignment you are given a number and have to make it
 * negative. But maybe the number is already negative?
 *
 * Example:
 *
 * ReturnNegative.MakeNegative(1); // return -1
 * ReturnNegative.MakeNegative(-5); // return -5
 * ReturnNegative.MakeNegative(0); // return 0
 *
 * Notes:
 * The number can be negative already, in which case no change is required.
 * Zero (0) can't be negative, see examples above.
 *
 * Author: Unai de la O
 */

 using System;
 public static class ReturnNegative
 {
   public static int MakeNegative(int number)
   {
     return (number > 0) ? -number : (number < 0) ? number : 0;
   }
 }
