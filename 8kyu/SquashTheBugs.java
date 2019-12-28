import java.util.*;

/**
 * Squash the bugs - Java
 * 
 * Simple challenge - eliminate all bugs from the supplied code so that the code
 * runs and outputs the expected value.
 * 
 * Output should be the length of the longest word, as a number.
 * 
 * @author Unai de la O
 */
public class SquashTheBugs {

    public static int findLongest(String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }
}