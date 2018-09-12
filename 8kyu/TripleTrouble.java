/**
 * Triple Trouble - Java
 * 
 * Create a function that will return a string that combines all of the letters of the three
 * inputed strings in groups. Taking the first letter of all of the inputs and grouping them next
 * to each other. Do this for every letter, see example below!
 * 
 * Ex) Input: "aa", "bb" , "cc" => Output: "abcabc"
 * 
 * Note: You can expect all of the inputs to be the same length.
 * 
 * @author Unai de la O
 */
public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result = result.concat(one.substring(i, i+1)).concat(two.substring(i, i+1)).concat(three.substring(i, i+1));
        }
        return result;
    }
}