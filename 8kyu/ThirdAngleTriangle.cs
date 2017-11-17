/*
 * Third angle of a triangle kata - C#
 *
 * You are given two angles (in degrees) of a triangle.
 * Write a function to return the 3rd.
 * Note: only positive integers will be tested.
 *
 * Author: Unai de la O
 */

 using System;

 public class ThirdAngleTriangle
 {
   public static int OtherAngle(int a, int b)
   {
     return 180 - (a + b);
   }
 }
