/**
 * Twice as old - Java
 * 
 * Your function takes two arguments:
 *     - current father's age (years)
 *     - current age of his son (years)
 * 
 * Сalculate how many years ago the father was twice as old as his son (or in how many years he will
 * be twice as old).
 * 
 * @author Unai de la O
 */
public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - (2 * sonYears));
    }
}