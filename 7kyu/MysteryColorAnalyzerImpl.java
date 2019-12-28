import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

/**
 * Mystery Colors - Java
 *
 * Create the implementation for the interface.
 *
 * @author Unai de la O
 */
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {

    public int numberOfDistinctColors(List<Color> mysteryColors) {
        List<Color> distinctColors = mysteryColors.stream().distinct().collect(Collectors.toList());

        return distinctColors.size();
    }

    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        return Collections.frequency(mysteryColors, color);
    }
}