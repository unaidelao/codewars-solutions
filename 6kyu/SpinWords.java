/*
 * Spin Words kata - Java
 *
 * Write a function that takes in a string of one or more words, and returns
 * the same string, but with all five or more letter words reversed.
 *
 * Strings passed in will consist of only letters and spaces. Spaces will be
 * included only when more than one word is present.
 *
 *   Examples:
 *
 *   spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 *
 *   spinWords( "This is a test") => returns "This is a test"
 *
 *   spinWords( "This is another test" )=> returns "This is rehtona test"
 *
 * Author: Unai de la O
 */

public class SpinWords {
	public static void main(String[] args) {
		String s = "Hey fellow warriors";
		String s2 = "Just kidding [there is still] one more";

		System.out.println(spinWords(s));
		System.out.println(spinWords(s2));
	}
	public static String spinWords(String sentence) {
		String[] strArray = sentence.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() > 5) {
				if (strArray[i].contains("[")) {
					String bracket = strArray[i].substring(0,1);
					String rest = new StringBuilder(strArray[i].substring(1,strArray[i].length())).reverse().toString();
					String reversed = bracket.concat(rest);
					strArray[i] = reversed;
				}
				else if (strArray[i].contains("]")) {
					String bracket = strArray[i].substring(strArray[i].length()-1);
					String rest = new StringBuilder(strArray[i].substring(0,strArray[i].length()-1)).reverse().toString();
					String reversed = rest.concat(bracket);
					strArray[i] = reversed;
				}
				else {
					String reversed = new StringBuilder(strArray[i]).reverse().toString();
					strArray[i] = reversed;
				}
			}
		}

		String res = String.join(" ", strArray);
		return res;
	}
}