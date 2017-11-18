/*
 * Shortest Word - C#
 *
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data
 * types.
 *
 * Author: Unai de la O
 */
 using System;
 using System.Linq;

 public class ShortestWordInString
 {
   public static int FindShort(string s)
   {
     string[] words = s.Split(' ');
     int[] lengthsArr = new int[words.Length];

     for (int i = 0; i < lengthsArr.Length; i++)
     {
       lengthsArr[i] = words[i].Length;
     }
     return lengthsArr.Min();
   }
 }
