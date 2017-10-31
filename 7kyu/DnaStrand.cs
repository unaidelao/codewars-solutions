// Complementary DNA kata - C#
//
// Author: Unai de la O

using System;

public class DnaStrand
{
    public static string MakeComplement(string dna)
    {
        string finalStr = "";

        for (int i = 0; i < dna.Length; i++)
        {
          char actual = dna[i];

          if (actual == 'A')
            finalStr += 'T';
          else if (actual == 'T')
            finalStr += 'A';
          else if (actual == 'C')
            finalStr += 'G';
          else if (actual == 'G')
            finalStr += 'C';
        }
        return finalStr;
    }

    public static void Main(string[] args)
    {
      // string vacío, necesario para que se pudiesen pasar todos los tests
      string test = "";

      Console.WriteLine(MakeComplement(test));
    }
}
