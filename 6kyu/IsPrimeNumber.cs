/*
 * Is a number prime? kata - C#
 *
 * Define a function isPrime/is_prime() that takes one integer argument and
 * returns true/True or false/False depending on if the integer is a prime.
 *
 * Author: Unai de la O
 */

using System;

public static class IsPrimeNumber
{
  public static bool IsPrime(int n)
  {
    if (n <= 1)
    {
      return false;
    }
    if (n == 2)
    {
      return true;
    }

    if (n % 2 == 0)
    {
      return false;
    }

    int nSqrt = (int)Math.Sqrt(n);

    for (int divisor = 3; divisor <= nSqrt; divisor += 2)
    {
      if (n % divisor == 0)
      {
        return false;
      }
    }
    return true;
  }
}
