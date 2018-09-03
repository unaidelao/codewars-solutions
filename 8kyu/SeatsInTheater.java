/**
 * Count odd numbers below n - Java
 * 
 * Given the total number of rows and columns in the theater (nRows and nCols, respectively), and
 * the row and column you're sitting in, return the number of people who sit strictly behind you
 * and in your column or to the left, assuming all seats are occupied.
 * 
 * @author Unai de la O
 */
public class SeatsInTheater {
    public static void main(String[] args) {
        System.out.println(seatsInTheater(16, 11, 5, 3)); // expected 96
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - col +1) * (nRows - row);
    }
}