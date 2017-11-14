/*
 * Write a function taking two parameters and returning an int array of all
 * elements between the input parameters and including them.
 *
 * Author: Unai de la O
 */
 
 using System;
 using System.Collections;

 public static class WhatIsBetween
    {
        public static int[] Between(int a, int b)
        {
           ArrayList arrList = new ArrayList();
           for (int i = a; i <= b; i++)
           {
             arrList.Add(i);
           }
           int[] result = (int[])arrList.ToArray(typeof(int));
           return result;
        }
    }