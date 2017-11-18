/**
 * Shortest Word - Java
 *
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data
 * types.
 * 
 * @author Unai de la O
 */

 import java.util.Arrays;

 public class ShortestWordInString {
   public static int findShort(String s) {
     String[] words = s.split(" ");
     int[] lengthsArr = new int[words.length];

     for (int i = 0; i < lengthsArr.length; i++) {
       lengthsArr[i] = words[i].length();
     }
     Arrays.sort(lengthsArr);
     return lengthsArr[0];
   }
 }
