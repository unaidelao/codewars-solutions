/**
 * Mumbling - Java
 * 
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 *     Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 *     Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 *     Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 *     The parameter of accum is a string which includes only letters from a..z and A..Z.
 * 
 * @author Unai de la O
 */
public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
            result += s.substring(0, 1).toUpperCase();
            }
            else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        result += s.substring(i, i+1).toUpperCase();
                    }
                    else {
                        result += s.substring(i, i+1).toLowerCase();
                    }
                }
            }
            result += "-";
        }
        result = result.substring(0, result.length() -1);
        return result;
    }
}