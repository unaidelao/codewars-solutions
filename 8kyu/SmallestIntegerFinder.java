/*
 * Find the smallest integer in the array kata - Java
 *
 * Given an array of integers your solution should find the smallest integer.
 *
 * You can assume, for the purpose of this kata, that the supplied array will
 * not be empty.
 *
 * Author: Unai de la O
 */

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      return Arrays.stream(args).min().getAsInt();
    }
}