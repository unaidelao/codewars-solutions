/**
 * String Repeat - C#
 * 
 * Write a function called repeatStr which repeats the given string string exactly n times.
 * 
 * @author Unai de la O
 */
 namespace Solution
{
  public static class Program
  {
    public static string repeatStr(int n, string s)
    {
      string result = "";
      for(int i = 0 ; i < n; i++){
        result += s;
      }
      return result;
    }
  }
}