/**
 * Vasya Pupkin just started learning Java and C#. At first, he decided to write simple program
 * that was supposed to sum up two small numbers (numbers and their sum fit in a byte), but it
 * didn't work. Vasya was too sad to find out what is wrong. Help him to correct the mistake.
 * 
 * @author Unai de la O
 */
public class ByteSum {
    public static byte sum (byte a, byte b) {
        byte c = (byte) (a + b); // needed a byte casting.
        return c;
    }
}