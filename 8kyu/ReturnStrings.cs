/**
 * Return Strings - Java
 * 
 * Make a function that will return a greeting statement that uses an input; your program should
 * return, "Hello, <name> how are you doing today?".
 * 
 * Author: Unai de la O
 */
using System;

public static class ReturnStrings
{
  public static string Greet(string name)
  {
   return String.Format("Hello, {0} how are you doing today?", name);
  }
}