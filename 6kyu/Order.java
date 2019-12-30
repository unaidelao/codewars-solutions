import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Order - Java
 * 
 * Your task is to sort a given string. Each word in the string will contain a
 * single number. This number is the position the word should have in the
 * result. Note: Numbers can be from 1 to 9. So 1 will be the first word (not
 * 0).
 * 
 * If the input string is empty, return an empty string. The words in the input
 * String will only contain valid consecutive numbers.
 * 
 * @author Unai de la O
 */
public class Order {

    public static void main(String[] args) {
        String input = "is2 Thi1s T4est 3a";
        String input2 = "4of Fo1r pe6ople g3ood th5e the2";

        System.out.println(order(input));
        System.out.println(order(input2));
    }

    public static String order(String words) {
        if (words.equals("")) {
            return "";
        }

        String[] arrayOfWords = words.split(" ");
        List<String> resultList = new ArrayList<String>(Arrays.asList(arrayOfWords));

        // Overwrite ordered words into resultList.
        for (String word : arrayOfWords) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    resultList.set(Integer.parseInt(String.valueOf(word.charAt(i))) - 1, word);
                }
            }
        }
        // Beautify final String result.
        String result = resultList.toString();
        result = result.replace("[", "").replace("]", "").replace(",", "");

        return result;
    }
}