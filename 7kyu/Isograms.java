import java.util.HashSet;
import java.util.Set;

/**
 * Isograms - Java
 *
 * An isogram is a word that has no repeating letters, consecutive or
 * non-consecutive. Implement a function that determines whether a string that
 * contains only letters is an isogram. Assume the empty string is an isogram.
 * Ignore letter case.
 *
 * @author Unai de la O
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        if (str.equals("")) {
            return true;
        }
        int strLength = str.length();

        String[] strArray = str.toUpperCase().split("");
        Set<String> set = new HashSet<>();

        for (String s : strArray) {
            set.add(s);
        }

        return set.size() == strLength;
    }

}