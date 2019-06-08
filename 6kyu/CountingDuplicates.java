
/**
 * Counting Duplicates - Java
 * 
 * Write a function that will return the count of distinct case-insensitive alphabetic characters
 * and numeric digits that occur more than once in the input string. The input string can be
 * assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * 
 * @author Unai de la O
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static void main(String[] args) {
        String s1 = "ABCDABC"; // 3
        System.out.println(countDuplicates(s1));
    }

    public static int countDuplicates(String s) {
        Collection<String> sList = Arrays.asList(s.toUpperCase().split(""));
        List<String> duplicatesList = sList.stream().distinct().filter(i -> Collections.frequency(sList, i) > 1)
                .collect(Collectors.toList());

        return duplicatesList.size();
    }
}