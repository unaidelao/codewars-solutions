/*
 * Complementary DNA kata - Java
 *
 * @author Unai de la O
 */

public class DnaStrand {
  public static String makeComplement(String dna) {
    String finalStr = "";

    for (int i = 0; i < dna.length(); i++) {
      char actual = dna.charAt(i);

      if (actual == 'A') {
        finalStr += 'T';
      }
      else if (actual == 'T') {
        finalStr += 'A';
      }
      else if (actual == 'C') {
        finalStr += 'G';
      }
      else if (actual == 'G') {
        finalStr += 'C';
      }
    }
    return finalStr;
  }

 public static void main(String[] args) {
   String test = "";

   System.out.println(makeComplement(test));
 }
}
