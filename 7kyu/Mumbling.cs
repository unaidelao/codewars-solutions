/*
    Mumbling - C#
    
    This time no story, no theory. The examples below show you how to write function accum:
    Examples:
        Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
        Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
        The parameter of accum is a string which includes only letters from a..z and A..Z.
    
    Author: Unai de la O
 */
using System;

public class Mumbling
{
    public static void Main(string[] args)
    {
        Console.WriteLine(accum("abcd"));
        Console.WriteLine(accum("RqaEzty"));
        Console.WriteLine(accum("cwAt"));
        Console.WriteLine(accum("ZpglnRxqenU"));
    }
    public static string accum(string s) 
    {
         string result = "";
            for (int i = 0; i < s.Length; i++)
            {
                if (i == 0)
                {
                    result += s[0].ToString().ToUpper();
                }
                else
                {
                    for (int j = 0; j <= i; j++)
                    {
                        if (j == 0)
                        {
                            result += s[i].ToString().ToUpper();
                        }
                        else
                        {
                            result += s[i].ToString().ToLower();
                        }
                    }
                }
                result += "-";
            }
            result = result.Remove(result.Length - 1);
            return result;
  }
}
