/**
 * Ghost Color - Java
 *
 * Ghost objects are instantiated without any arguments. Ghost objects are given
 * a random color attribute of white" or "yellow" or "purple" or "red" when
 * instantiated.
 *
 * @author Unai de la O
 */

public class GhostColor {
    String[] colors = { "white", "yellow", "purple", "red" };

    String color;

    public GhostColor() {
        this.color = colors[(int) (Math.random() * 4)];
    }

    public String getColor() {
        return this.color;
    }
}