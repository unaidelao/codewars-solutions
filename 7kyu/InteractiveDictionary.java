import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
/**
 * Interactive Dictionary - Java
 *
 * In this kata, your job is to create a class Dictionary
 * which you can add words to and their entries.
 *
 * @author Unai de la O
 */
public class Dictionary {
    private HashMap<String, String> dic;
    
    public Dictionary() {
        dic = new HashMap<>();
    }
    
    public void newEntry(String word, String meaning) {
        dic.put(word, meaning);
    }
    
    public String lookEntry(String word) {
        if (dic.get(key) == null) {
            return "Cannot find entry for " + key;
        }
        return dic.get(word);
    }
    
    public void deleteEntry(String word) {
        dic.remove(word);
    }
    
    @Override
    public String toString() {
        Set set = dic.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry mentry = (Map.Entry) iter.next();
            return String.format("%s: %s%n%n", mentry.getKey(), mentry.getValue());
        }
        return "Empty Dictionary.";
    }
}