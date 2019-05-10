/**
 * Who likes it - C#
 *
 * You probably know the "like" system from Facebook and other pages.
 * People can "like" blog posts, pictures or other items.
 * We want to create the text that should be displayed next to such an item.
 *
 * Implement a function likes :: [String] -> String, which must take in input array,
 * containing the names of people who like an item. It must return the display text as shown
 * in the examples:
 *     likes {} // must be "no one likes this"
 *     likes {"Peter"} // must be "Peter likes this"
 *     likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
 *     likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
 *     likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 *     For 4 or more names, the number in and 2 others simply increases.
 * 
 * Author: Unai de la O
 */
using System;

public static class Kata
{
  public static string Likes(string[] name)
  {
    int len = name.Length;
        
      switch(len)
      {
        case 0:
          return "no one likes this";
        case 1:
          return String.Format("{0} likes this", name[0]);
        case 2:
          return String.Format("{0} and {1} like this", name[0], name[1]);
        case 3:
          return String.Format("{0}, {1} and {2} like this", name[0], name[1], name[2]);
        default:
          return String.Format("{0}, {1} and {2} others like this", name[0], name[1], len-2);
      }
  }
}