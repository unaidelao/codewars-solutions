/*
 * Difference in age - C#
 *
 * At the annual family gathering, the family likes to find the oldest living
 * family member’s age and the youngest family member’s age and calculate the
 * difference between them.
 *
 * You will be given an array of all the family members' ages, in any order.
 * The ages will be given in whole numbers, so a baby of 5 months, will have an
 * ascribed ‘age’ of 0. Return a new array with [youngest age, oldest age,
 * difference between the youngest and oldest age].
 *
 * Author: Unai de la O
 */

 using System;

 public class DifferenceInAgesKata
 {
   public static int[] DifferenceInAges(int[] ages)
   {
     Array.Sort(ages);

     int[] result = new int[3];
     result[0] = ages[0];
     result[1] = ages[ages.Length -1];
     result[2] = result[1] - result[0];

     return result;
   }
 }
