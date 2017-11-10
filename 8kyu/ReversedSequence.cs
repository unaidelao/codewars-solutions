/*
 * Reversed Sequence kata - C#
 *
 * Get the number n to return the reversed sequence from n to 1.
 * Example : n==5 >> [5,4,3,2,1]
 *
 * Author: Unai de la O
 */

 using System;

 public static class ReversedSequence
 {
   public static int[] ReverseSeq(int n)
   {
     int[] result = new int[n];
     for (int i = 0, num = n; i < n; i++, num--)
     {
       result[i] = num;
     }
     return result;
   }
 }
