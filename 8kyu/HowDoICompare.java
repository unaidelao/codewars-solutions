/**
 * How do I compare numbers? - Java
 *
 * What could be easier than comparing integer numbers? However, the given
 * piece of code doesn't recognize some of the special numbers for a reason to
 * be found. Your task is to find the bug and eliminate it.
 *
 * @author Unai de la O
 */

 public class HowDoICompare {
   public static String whatIs(Integer x) {
     if (x == 42)
       return "everything";
     else if (x == 42 * 42)
       return "everything squared";
     else
       return "nothing";
    }

    static final Object[][] specialNumbers = {
      {42, "everything"},
      {42 * 42, "everything squared"},
    };
 }
