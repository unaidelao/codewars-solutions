/**
 * Given an array of Player objects and an index (1-based), return the name of the chosen Player.
 * 
 * Example:
 * 
 * duck_duck_goose([a, b, c, d], 1) should return a.name
 * duck_duck_goose([a, b, c, d], 5) should return a.name
 * duck_duck_goose([a, b, c, d], 4) should return d.name
 * 
 * @author Unai de la O
 */

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        return (goose % players.length == 0) ? players[players.length-1].name : players[goose % players.length - 1].name;
    }
  }