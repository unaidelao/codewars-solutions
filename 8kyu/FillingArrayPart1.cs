/*
 * Filling an array (part 1) - C#
 *
 * We want an array, but not just any old array, an array with contents!
 * Write a function that produces an array with the numbers 0 to N-1 in it.
 * For example, the following code will result in an array containing the
 * numbers 0 to 4: arr(5) // => [0,1,2,3,4]
 *
 * Author: Unai de la O
 */

 using System;

 public class FillingArrayPart1
 {
   public static int[] Arr(int N)
   {
     int[] result = new int[N];
     for (int i = 0; i < result.Length; i++)
     {
       result[i] = i;
     }
     return result;
   }
 }
