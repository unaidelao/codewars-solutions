/*
 * Highest Scoring Word kata - Java
 *
 * Given a string of words, you need to find the highest scoring word.
 *
 * Each letter of a word scores points according to it's position in the
 * alphabet: a = 1, b = 2, c = 3 etc.
 *
 * You need to return the highest scoring word as a string.
 *
 * If two words score the same, return the word that appears earliest in the
 * original string.
 *
 * All letters will be lowercase and all inputs will be valid.
 *
 * Author: Unai de la O
 */

public class Kata {

  public static String high(String s) {
    String[] arrStr = s.split(" ");
    String largestStr = "";
    int largestStrSum = 0;
    int tmpSum = 0;
    
    for (int i = 0; i < arrStr.length; i++) {
      for (int j = 0; j < arrStr[i].length(); j++) {
        tmpSum += getScore(arrStr[i].charAt(j));
      }
      if (tmpSum > largestStrSum) {
        largestStrSum = tmpSum;
        largestStr = arrStr[i];
        tmpSum = 0;
      }
      else {
        tmpSum = 0;
      }
    }
    return largestStr;
  }
  
  public static int getScore (char c) {
	  int res = 0;
    switch (c) {
      case 'a':
        res += 1;
        break;
      case 'b':
        res += 2;
        break;
      case 'c':
        res +=3;
        break;
      case 'd':
        res += 4;
        break;
      case 'e':
        res += 5;
        break;
      case 'f':
        res += 6;
        break;
      case 'g':
        res += 7;
        break;
      case 'h':
        res += 8;
        break;
      case 'i':
        res += 9;
        break;
      case 'j':
        res += 10;
        break;
      case 'k':
        res += 11;
        break;
      case 'l':
        res += 12;
        break;
      case 'm':
        res += 13;
        break;
      case 'n':
        res += 14;
        break;
      case 'o':
        res += 15;
        break;
      case 'p':
        res += 16;
        break;
      case 'q':
        res += 17;
        break;
      case 'r':
        res += 18;
        break;
      case 's':
        res += 19;
        break;
      case 't':
        res += 20;
        break;
      case 'u':
        res += 21;
        break;
      case 'v':
        res += 22;
        break;
      case 'w':
        res += 23;
        break;
      case 'x':
        res += 24;
        break;
      case 'y':
        res += 25;
        break;
      case 'z':
        res += 26;
        break;
    }
    return res;
  }

}