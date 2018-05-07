/*
 * Is Valid Walk kata - C#
 *
 * You live in the city of Cartesia where all roads are laid out in a perfect
 * grid. You arrived ten minutes too early to an appointment, so you decided to
 * take the opportunity to go for a short walk.
 *
 * The city provides its citizens with a Walk Generating App on their phones
 * -- everytime you press the button it sends you an array of one-letter
 * strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You
 * always walk only a single block in a direction and you know it takes you one
 * minute to traverse one city block, so create a function that will return
 * true if the walk the app gives you will take you exactly ten minutes
 * you don't want to be early or late!) and will, of course, return you to your
 * tarting point. Return false otherwise.
 *
 * Note: you will always receive a valid array containing a random assortment
 * of direction letters ('n', 's', 'e', or 'w' only). It will never give you an
 * empty array (that's not a walk, that's standing still!).
 *
 * Author: Unai de la O.
 */

public class Kata
{
  public static bool IsValidWalk(string[] walk)
  {
    // Max steps
    const int MAX_STEPS = 10;
    // That's the origin point.
    int x = 0;
    int y = 0;
    
    foreach (var s in walk)
    {
      switch (s)
      {
        case "n":
          y += 1;
          break;
        case "s":
          y -= 1;
          break;
        case "e":
          x += 1;
          break;
        case "w":
          x -= 1;
          break;
      }
    }
    return x == 0 && y == 0 && walk.Length == MAX_STEPS;
  }
}