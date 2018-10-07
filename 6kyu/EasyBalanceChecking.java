import java.text.DecimalFormat;
/**
 * Easy Balance Checking - Java
 * 
 * You are given a (small) check book as a -sometimes- cluttered (by non-alphanumeric characters)
 * string:
 * 
 * "1000.00
 * 125 Market 125.45
 * 126 Hardware 34.95
 * 127 Video 7.45
 * 128 Book 14.32
 * 129 Gasoline 16.10"
 * 
 * The first line shows the original balance. Each other line (when not blank) gives information:
 * check number, category, check amount.
 * 
 * First you have to clean the lines keeping only letters, digits, dots and spaces.
 * 
 * Then return a report as a string (underscores show spaces -- don't put them in your solution.
 * They are there so you can see them and how many of them you need):
 * 
 * "Original_Balance:_1000.00
 * 125_Market_125.45_Balance_874.55
 * 126_Hardware_34.95_Balance_839.60
 * 127_Video_7.45_Balance_832.15
 * 128_Book_14.32_Balance_817.83
 * 129_Gasoline_16.10_Balance_801.73
 * Total_expense__198.27
 * Average_expense__39.65"
 * 
 * On each line of the report you have to add the new balance and then in the last two lines the
 * total expense and the average expense. So as not to have a too long result string we don't ask
 * for a properly formatted result.
 * 
 * Notes
 * One (or more) line can be blank.
 * Use printf %.2f to get 2 decimals.
 * The line separator of results may depend on the language \n or \r\n. You can see examples in
 * the "Sample tests".
 * 
 * @author Unai de la O
 */
public class EasyBalanceChecking {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static String balance(String book) {
        String bookRepl = book.replaceAll("[!=:,;?{}]", "").replace("\n", " ").replace("\r", "").replace("  ", " ");
        String[] bookArr = bookRepl.split(" ");
		
        int libroLen = bookArr.length-1;
        int registroLen = 3;
        double balance = Double.parseDouble(bookArr[0]);
        double totalExpense = 0;
        int bookArrIndex = 1;
        
        String resultado = "Original Balance: " + df.format(balance) + "\\r\\n";
        String[][] registros = new String[libroLen/3][registroLen];
        
        // Rellena array registros desde bookArr
        for (int idx = 0; idx < libroLen/3; idx++) {
            for (int jdx = 0; jdx < registroLen; jdx++) {
                registros[idx][jdx] = bookArr[bookArrIndex];
                bookArrIndex++;
            }
        }
        
        // Completa String resultado
        for (int i = 0; i < libroLen/3 + 1; i++) {
            if (i == libroLen/3) {
                resultado += "Total expense  " + df.format(totalExpense) + "\\r\\n" + "Average expense  " + String.format("%.2f",(totalExpense / (libroLen/3)));
                continue;
            }
            for (int j = 0; j < registroLen; j++) {
                if (j == 2) {
                    String tmpExpense = df.format(Double.parseDouble(registros[i][2]));
                    totalExpense += Double.parseDouble(tmpExpense);
                    String tmpBalance = df.format(Double.parseDouble(registros[i][2]));
                    balance -= Double.parseDouble(tmpBalance);
                    resultado += registros[i][j] + " " + "Balance " + String.format("%.2f",balance) + "\\r\\n";
                }
                else {
            	    resultado += registros[i][j] + " ";
                }
            }
        }

        return resultado;
    }
}