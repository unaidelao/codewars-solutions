/**
 * String Repeat - Java
 * 
 * Write a function called repeatStr which repeats the given string string
 * exactly n times.
 * 
 * @author Unai de la O
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }
}