/**
 * Convert to binary - Java
 * 
 * Given a non-negative integer n, write a function toBinary/ToBinary which
 * returns thatnumber in a binary format.
 * 
 * @author Unai de la O
 */
public class Kata {

    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}