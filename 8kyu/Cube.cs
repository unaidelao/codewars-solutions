// Playing with cubes 1 kata - C#
//
// Author: Unai de la O
//
// Create a public class called Cube without a constructor which gets one
// single private Integer variable Side, a getter GetSide() and a setter
// SetSide(int num) method for this property. Actually, getter and setter
// methods are not the common way to write this code in C#. In the next kata of
// this series, we gonna refactor the code and make it a bit more professional.
// Note: There's no need to check for negative values!

using System;

public class Cube
{
  private int Side;

  public int GetSide()
  {
    return Side;
  }

  public void SetSide(int num)
  {
    Side = num;
  }
}
