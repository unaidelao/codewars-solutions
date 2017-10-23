/**
 * Training if/else and ternary operator. SaleHotdogs kata - Java
 *
 * @author Unai de la O
 */
 
 public class SaleHotdogs {
   public static int saleHotdogs(final int n) {
     int price;
     
     if (n < 5)
       price = 100;
     else if (n < 10)
       price = 95;
     else
       price = 90;
     
     return n * price;
   }
 }