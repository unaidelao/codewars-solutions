/**
 * 6 kyu - Persistence kata.
 * 
 * Write a function, persistence, that takes in a positive parameter num and
 * returns its multiplicative persistence, which is the number of times you must
 * multiply the digits in num until you reach a single digit.
 * 
 * @author Unai de la O
 */
public class Persistence {
    public static void main(String[] args) {
        int n = 39;

        int resultadoFinal = persistence(n);
        System.out.println(resultadoFinal);

    }

    public static int persistence(int num) {
        int contador = 0;
        int computoParcial = 1;
        int resultado = num;
        int itemsMultiplicando = 0;
        String[] multiplicandos;

        while (itemsMultiplicando != 1) {
            multiplicandos = String.valueOf(resultado).split("");
            itemsMultiplicando = multiplicandos.length;

            for (String multiplicando : multiplicandos) {
                computoParcial *= Integer.parseInt(multiplicando);
            }

            resultado = computoParcial;
            computoParcial = 1;
            contador++;
        }

        return contador - 1;
    }
}