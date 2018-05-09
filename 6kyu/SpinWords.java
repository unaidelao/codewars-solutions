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

  public String spinWords(String sentence) {
    String[] strArray = sentence.split(" ");
		
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() > 5) {
				String reversed = new StringBuilder(strArray[i]).reverse().toString();
				strArray[i] = reversed;
			}
		}
		String res = String.join(" ", strArray);
		return res;
	}
}