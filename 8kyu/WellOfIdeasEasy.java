/**
 * Well of ideas - Easy version
 * 
 * In this kata you need to check the provided array (x) for good ideas 'good'
 * and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!',
 * if there are more than 2 return 'I smell a series!'. If there are no good
 * ideas, as is often the case, return 'Fail!'.
 * 
 * @author Unai de la O
 */
public class WellOfIdeasEasy {

    public static void main(String[] args) {
        System.out.println(well(new String[] { "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good" }));
    }

    public static String well(String[] x) {
        int goodIdeasCounter = 0;

        for (String s : x) {
            if (s.equals("good")) {
                goodIdeasCounter++;
            }
        }

        if (goodIdeasCounter > 2) {
            return "I smell a series!";
        } else if (goodIdeasCounter == 0) {
            return "Fail!";
        } else {
            return "Publish!";
        }
    }
}