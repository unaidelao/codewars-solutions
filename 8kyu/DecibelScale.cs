/*
 * Decibel Scale kata - C#
 *
 * Calculate the loudness of a sound wave, given its intensity as a parameter
 * to the decibel function.
 *
 * Author: Unai de la O
 */
 using System;

 public static class DecibelScale
 {
   public static double DbScale(double intensity)
   {
     return 10 * Math.Log10(intensity / Math.Pow(10, -12));
   }
 }
