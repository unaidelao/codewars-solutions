/*
 * Training if/else and ternary operator. SaleHotdogs kata - C#
 *
 * Author: Unai de la O
 */
 
 public class SaleHotdogs
 {
   public static int SaleHotdogs(int n)
   {
     return (n >= 10) ? (90 * n) : (n >= 5 && n < 10) ? (95 * n) : (100 * n);
   }
 }