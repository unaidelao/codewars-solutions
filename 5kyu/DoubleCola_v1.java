/**
 * Double Cola kata - Java
 *
 * Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double
 * Cola" drink vending machine; there are no other people in the queue. The
 * first one in the queue (Sheldon) buys a can, drinks it and doubles! The
 * resulting two Sheldons go to the end of the queue. Then the next in the
 * queue (Leonard) buys a can, drinks it and gets to the end of the queue as
 * two Leonards, and so on.
 *
 * Write a program that will return the name of the person who will drink the
 * n-th cola.
 *
 * Note that in the very beginning the queue looks like that:
 *     Sheldon, Leonard, Penny, Rajesh, Howard
 *
 * @author Unai de la O
 *
 * @version 1.0
 * Note: this version is ok, but not time efficient when n is very high.
 */

import java.util.ArrayList;

public class Line {
  public static String WhoIsNext(String[] names, int n)
  {
    // Create an ArrayList.
		ArrayList<String> namesList = new ArrayList<String>();
		 
    // Initialize that with the standar queue.
		for (int i = 0; i < names.length; i++) {
		  namesList.add(names[i]);
		}
	  // Proccess algorithm.
		for (int i = 1; i < n; i++) {
	    namesList.add(namesList.get(0));
			namesList.add(namesList.get(0));
			namesList.remove(0);
		}
		// Return result.
		return namesList.get(0);
  }
}